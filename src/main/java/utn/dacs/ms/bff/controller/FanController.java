package utn.dacs.ms.bff.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utn.dacs.ms.bff.dto.FanDTO;
import utn.dacs.ms.bff.service.FanService;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@Slf4j
public class FanController {
    @Autowired
    FanService fanService;

    @GetMapping("/fans")
    public List<FanDTO> fans(){
        return fanService.fans();
    }

    @GetMapping("/fans/{id}")
    public FanDTO fan(@PathVariable int id) {
        return fanService.fan(id);
    }

    @PostMapping("/fans")
    public FanDTO agregarFan(@RequestBody FanDTO fan) {
        return fanService.agregarFan(fan);
    }
    @PutMapping("/fans")
    public FanDTO modificarFan(@RequestBody FanDTO fan) {
        return fanService.modificarFan(fan);
    }

    @DeleteMapping("/fans/{id}")
    public String eliminarFan(@PathVariable int id){
        return fanService.eliminarFan(id);
    }

}