package utn.dacs.ms.bff.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.dacs.ms.bff.dto.PartidaDTO;
import utn.dacs.ms.bff.dto.RespuestaDTO;
import utn.dacs.ms.bff.service.EstadisticasService;
import utn.dacs.ms.bff.service.PartidaService;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@Slf4j
public class PartidaController {
    @Autowired
    private PartidaService partidaService;

    @GetMapping("/partidas/{nombre}/{tag}")
    public List<PartidaDTO> partidas(@PathVariable String nombre, @PathVariable String tag){
        return partidaService.partidas(nombre,tag);
    }

}
