package utn.dacs.ms.bff.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.dacs.ms.bff.api.client.MsConectorEstadisticas;
import utn.dacs.ms.bff.dto.PartidaDTO;

import java.util.List;

@Service
public class PartidaService {
    @Autowired
    MsConectorEstadisticas msConectorEstadisticas;

    public List<PartidaDTO> partidas(String nombre, String tag){
        return msConectorEstadisticas.partidas(nombre,tag).getData();
    }
}
