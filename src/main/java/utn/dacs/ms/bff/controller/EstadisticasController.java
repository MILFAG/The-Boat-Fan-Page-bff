package utn.dacs.ms.bff.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;
import utn.dacs.ms.bff.api.client.MsBackend;
import utn.dacs.ms.bff.api.client.MsConectorContenido;
import utn.dacs.ms.bff.dto.EstadisticasDTO;
import utn.dacs.ms.bff.service.EstadisticasService;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@Slf4j
public class EstadisticasController {

    @Autowired
    private EstadisticasService estadisticasService;

    @GetMapping("/estadisticas/{nombre}/{tag}")
    public EstadisticasDTO resumen(@PathVariable String nombre, @PathVariable String tag){
        return estadisticasService.resumen(nombre,tag);
    }

}
