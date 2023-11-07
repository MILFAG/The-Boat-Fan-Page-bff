package utn.dacs.ms.bff.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.dacs.ms.bff.dto.AgenteDTO;
import utn.dacs.ms.bff.dto.PartidaDTO;
import utn.dacs.ms.bff.service.AgenteService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@Slf4j
public class AgenteController {
    @Autowired
    private AgenteService agenteService;
    @GetMapping("/agentes")
    public List<AgenteDTO> partidas(){
        return agenteService.agentes();
    }
    @GetMapping("/agentes/{nombre}")
    public Optional<AgenteDTO> partidas(@PathVariable String nombre){
        return agenteService.obtenerAgente(nombre);
    }
}
