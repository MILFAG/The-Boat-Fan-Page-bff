package utn.dacs.ms.bff.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utn.dacs.ms.bff.dto.SponsorDTO;
import utn.dacs.ms.bff.service.SponsorService;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@Slf4j
public class SponsorController {
    @Autowired
    SponsorService sponsorService;

    @GetMapping("/sponsors")
    public List<SponsorDTO> sponsors(){
        return sponsorService.sponsors();
    }

    @GetMapping("/sponsors/{id}")
    public SponsorDTO sponsor(@PathVariable int id) {
        return sponsorService.sponsor(id);
    }

    @PostMapping("/sponsors")
    public SponsorDTO agregarSponsor(@RequestBody SponsorDTO sponsor) {
        return sponsorService.agregarSponsor(sponsor);
    }
    @PutMapping("/sponsors")
    public SponsorDTO modificarSponsor(@RequestBody SponsorDTO sponsor) {
        return sponsorService.modificarSponsor(sponsor);
    }

    @DeleteMapping("/sponsors/{id}")
    public String eliminarSponsor(@PathVariable int id){
        return sponsorService.eliminarSponsor(id);
    }

}