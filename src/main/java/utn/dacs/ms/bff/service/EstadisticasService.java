package utn.dacs.ms.bff.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.dacs.ms.bff.api.client.MsConectorEstadisticas;
import utn.dacs.ms.bff.dto.EstadisticasDTO;
import utn.dacs.ms.bff.dto.PartidaDTO;
import utn.dacs.ms.bff.dto.RespuestaDTO;

import java.text.DecimalFormat;
import java.util.List;

@Service
public class EstadisticasService {
    @Autowired
    MsConectorEstadisticas msConectorEstadisticas;

    /**
     * Consulta a la api para obtener la lista de las ultimas partidas del jugador y calcula sus estadísticas
     * @param nombre: nombre del jugador para el cual se va a realizar la consulta
     * @param tag: tag del jugador para el cual se va a realizar la consulta
     * @return ResumenDTO con el resumen de estadísticas para las ultimas n partidas
     */
    public EstadisticasDTO resumen(String nombre, String tag){
        List<PartidaDTO> partidas = this.msConectorEstadisticas.partidas(nombre,tag).getData();
        EstadisticasDTO estadisticasDTO = new EstadisticasDTO();
        int parcialPuntaje = 0;
        float parcialKD = 0;
        float parcialHs = 0;
        int parcialDeltaDaño = 0;
        float partidasGanadas = 0;
        int cantPartidas = partidas.size();
        for (int i = 0; i < (cantPartidas-1); i++) {
            PartidaDTO partida = partidas.get(i);
            if (i == 0)
                estadisticasDTO.setRango(partida.getStats().getRango());
            parcialPuntaje += calcularACS(partida);
            parcialKD += partida.getStats().getAsesinatos()/partida.getStats().getMuertes();
            parcialHs += this.calcularPorcHs(partida);
            parcialDeltaDaño += partida.getStats().getDaño().getHecho() - partida.getStats().getDaño().getRecibido();
            if (esVictoria(partida))
                partidasGanadas += 1;
        }
        estadisticasDTO.setACS(Math.floorDiv(parcialPuntaje,cantPartidas));
        estadisticasDTO.setKd(parcialKD/cantPartidas);
        estadisticasDTO.setPorcHs(parcialHs/cantPartidas);
        estadisticasDTO.setDeltaDanio(Math.floorDiv(parcialDeltaDaño,cantPartidas));
        estadisticasDTO.setPorcVictorias(partidasGanadas/cantPartidas);
        estadisticasDTO.setUltimaPartida(partidas.get(partidas.size()-1).getMetadata().getInicio());
        return estadisticasDTO;
    }

    private boolean esVictoria (PartidaDTO partida){
        String equipo = partida.getStats().getEquipo();
        int rojo = partida.getResultados().getRojo();
        int azul = partida.getResultados().getAzul();
        if (rojo>azul){
            return equipo.equalsIgnoreCase("Red") ;
        } else if (rojo<azul) {
            return equipo.equalsIgnoreCase("Blue");
        }
        else
            return false;

    }

    private float calcularPorcHs(PartidaDTO partida){
        float disparosTotales = (float) partida.getStats().getDisparos().getCabeza();
        disparosTotales += partida.getStats().getDisparos().getCuerpo();
        disparosTotales += partida.getStats().getDisparos().getPiernas();
        return partida.getStats().getDisparos().getCabeza()/disparosTotales;
    }

    private int calcularACS(PartidaDTO partida){
        int rondasTotales = partida.getResultados().getAzul() + partida.getResultados().getRojo();
        return Math.floorDiv(partida.getStats().getPuntaje(),rondasTotales);
    }

}





