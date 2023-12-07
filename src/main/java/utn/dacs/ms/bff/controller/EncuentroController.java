package utn.dacs.ms.bff.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utn.dacs.ms.bff.dto.EncuentroDTO;
import utn.dacs.ms.bff.service.EncuentroService;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@Slf4j
public class EncuentroController {
    @Autowired
    EncuentroService encuentroService;

    @GetMapping("/encuentros")
    public List<EncuentroDTO> encuentros(){
        return encuentroService.encuentros();
    }

    @GetMapping("/encuentros/proximos")
    public List<EncuentroDTO> proximos(){
        return encuentroService.proximos();
    }

    @GetMapping("/encuentros/{id}")
    public EncuentroDTO encuentro(@PathVariable int id) {
        return encuentroService.encuentro(id);
    }

    @PostMapping("/encuentros")
    public EncuentroDTO agregarEncuentro(@RequestBody EncuentroDTO encuentro) {
        return encuentroService.agregarEncuentro(encuentro);
    }
    @PutMapping("/encuentros")
    public EncuentroDTO modificarEncuentro(@RequestBody EncuentroDTO encuentro) {
        return encuentroService.modificarEncuentro(encuentro);
    }

    @DeleteMapping("/encuentros/{id}")
    public String eliminarEncuentro(@PathVariable int id){
        return encuentroService.eliminarEncuentro(id);
    }

}
