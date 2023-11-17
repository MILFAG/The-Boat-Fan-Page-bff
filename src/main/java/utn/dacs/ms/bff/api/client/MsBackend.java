package utn.dacs.ms.bff.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import utn.dacs.ms.bff.dto.EncuentroDTO;
import utn.dacs.ms.bff.dto.FanDTO;
import utn.dacs.ms.bff.dto.JugadorDTO;
import utn.dacs.ms.bff.dto.SponsorDTO;

import java.util.List;

@FeignClient(
        name = "msBackend",
        url = "${feign.client.config.msBackend.url}"
)
public interface MsBackend {

    @GetMapping("/jugadores")
    public List<JugadorDTO> jugadores();
    @GetMapping("/jugadores/{id}")
    public JugadorDTO jugador(@PathVariable int id);
    @PostMapping("/jugadores")
    public JugadorDTO agregarJugador(@RequestBody JugadorDTO jugador);
    @PutMapping("/jugadores")
    public JugadorDTO modificarJugador(@RequestBody JugadorDTO jugador);
    @DeleteMapping("/jugadores/{id}")
    public String eliminarJugador(@PathVariable int id);
    //////////////////////////////////////////////////////////////////////////////////////////
    @GetMapping("/sponsors")
    public List<SponsorDTO> sponsors();
    @GetMapping("/sponsors/{id}")
    public SponsorDTO sponsor(@PathVariable int id);
    @PostMapping("/sponsors")
    public SponsorDTO agregarSponsor(@RequestBody SponsorDTO sponsor);
    @PutMapping("/sponsors")
    public SponsorDTO modificarSponsor(@RequestBody SponsorDTO sponsor);
    @DeleteMapping("/sponsors/{id}")
    public String eliminarSponsor(@PathVariable int id);
    //////////////////////////////////////////////////////////////////////////////////////////
    @GetMapping("/fans")
    public List<FanDTO> fans();
    @GetMapping("/fans/{id}")
    public FanDTO fan(@PathVariable int id);
    @PostMapping("/fans")
    public FanDTO agregarFan(@RequestBody FanDTO fan);
    @PutMapping("/fans")
    public FanDTO modificarFan(@RequestBody FanDTO fan);
    @DeleteMapping("/fans/{id}")
    public String eliminarFan(@PathVariable int id);
    //////////////////////////////////////////////////////////////////////////////////////////
    @GetMapping("/encuentros")
    public List<EncuentroDTO> encuentros();
    @GetMapping("/encuentros/{id}")
    public EncuentroDTO encuentro(@PathVariable int id);
    @PostMapping("/encuentros")
    public EncuentroDTO agregarEncuentro(@RequestBody EncuentroDTO encuentro);
    @PutMapping("/encuentros")
    public EncuentroDTO modificarEncuentro(@RequestBody EncuentroDTO encuentro);
    @DeleteMapping("/encuentros/{id}")
    public String eliminarEncuentro(@PathVariable int id);


}
