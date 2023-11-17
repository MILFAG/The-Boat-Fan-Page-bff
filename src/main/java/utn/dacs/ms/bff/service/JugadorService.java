package utn.dacs.ms.bff.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.dacs.ms.bff.api.client.MsBackend;
import utn.dacs.ms.bff.dto.JugadorDTO;
import utn.dacs.ms.bff.dto.PartidaDTO;

import java.util.List;
@Service
public class JugadorService {
    @Autowired
    MsBackend msBackend;

    public List<JugadorDTO> jugadores(){
        return msBackend.jugadores();
    }
    public JugadorDTO jugador(int id){
        return msBackend.jugador(id);
    }
    public JugadorDTO agregarJugador(JugadorDTO jugador){
        return msBackend.agregarJugador(jugador);
    }
    public JugadorDTO modificarJugador(JugadorDTO jugador){
        return  msBackend.modificarJugador(jugador);
    }
    public String eliminarJugador(int id){
        return msBackend.eliminarJugador(id);
    }


}
