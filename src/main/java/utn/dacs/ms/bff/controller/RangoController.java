package utn.dacs.ms.bff.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.dacs.ms.bff.dto.PartidaDTO;
import utn.dacs.ms.bff.dto.RangoDTO;
import utn.dacs.ms.bff.dto.TiersCompetitivosDTO;
import utn.dacs.ms.bff.service.PartidaService;
import utn.dacs.ms.bff.service.RangoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@Slf4j
public class RangoController {
    @Autowired
    private RangoService rangoService;

    @GetMapping("/rangos")
    public List<RangoDTO> rangos(){
        return this.rangoService.rangos();
    }
    @GetMapping("/rangos/{id}")
    public Optional<RangoDTO> rangos(@PathVariable int id){
        return this.rangoService.obtenerRango(id);
    }

}
