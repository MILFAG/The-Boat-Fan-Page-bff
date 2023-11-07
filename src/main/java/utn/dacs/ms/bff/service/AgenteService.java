package utn.dacs.ms.bff.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.dacs.ms.bff.api.client.MsConectorContenido;
import utn.dacs.ms.bff.dto.AgenteDTO;
import java.util.List;
import java.util.Optional;


@Service
public class AgenteService {
    @Autowired
    MsConectorContenido conectorContenido;
    public List<AgenteDTO> agentes() {
        return this.conectorContenido.agentes().getData();
    }
    public Optional<AgenteDTO> obtenerAgente(String nombre) {
        return this.agentes().stream().filter(agente -> agente.getNombre().equalsIgnoreCase(nombre)).findAny();
    }
}