package utn.dacs.ms.bff.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import utn.dacs.ms.bff.api.client.MsBackend;
import utn.dacs.ms.bff.dto.EstadisticasDTO;
import utn.dacs.ms.bff.dto.JugadorDTO;
import utn.dacs.ms.bff.service.JugadorService;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@Slf4j
public class JugadorController {
    @Autowired
    JugadorService jugadorService;

    @GetMapping("/jugadores")
    public List<JugadorDTO> jugadores(){
        return jugadorService.jugadores();
    }

    @GetMapping("/jugadores/{id}")
    public JugadorDTO jugador(@PathVariable int id) {
        return jugadorService.jugador(id);
    }

    @PostMapping("/jugadores")
    public JugadorDTO agregarJugador(@RequestBody JugadorDTO jugador) {
        return jugadorService.agregarJugador(jugador);
    }
    @PutMapping("/jugadores")
    public JugadorDTO modificarJugador(@RequestBody JugadorDTO jugador) {
        return jugadorService.modificarJugador(jugador);
    }

    @DeleteMapping("/jugadores/{id}")
    public String eliminarJugador(@PathVariable int id){
        return jugadorService.eliminarJugador(id);
    }

}
