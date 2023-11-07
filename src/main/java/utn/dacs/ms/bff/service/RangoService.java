package utn.dacs.ms.bff.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.dacs.ms.bff.api.client.MsConectorContenido;
import utn.dacs.ms.bff.dto.RangoDTO;
import utn.dacs.ms.bff.dto.TiersCompetitivosDTO;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class RangoService {
    @Autowired
    MsConectorContenido msConectorContenido;
    public List<RangoDTO> rangos() {
        List<TiersCompetitivosDTO> tiers = this.msConectorContenido.rangos().getData();
        return tiers.get(tiers.size()-1).getRangos();
    }
    public Optional<RangoDTO> obtenerRango(int id) {
        return this.rangos().stream().filter(rango -> rango.getId() == id).findAny();
    }
}