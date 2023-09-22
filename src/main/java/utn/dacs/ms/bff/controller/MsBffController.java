package utn.dacs.ms.bff.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import utn.dacs.ms.bff.dto.BuildInfoDTO;
import utn.dacs.ms.bff.service.MsApiConectorService;

@RestController
@RequestMapping("/conector")
@Slf4j
public class MsBffController {

    @Autowired
    private MsApiConectorService apiConectorService;

    @GetMapping("/ping")
    public String ping() {
        return apiConectorService.ping();
    }
    
    @GetMapping("/version")
    public BuildInfoDTO getPropuestas() {
        return apiConectorService.version();
    }
    /*
    @GetMapping("/reason")
    public List<ReasonDTO> getMotivos() {
    	return apiConectorService.getReason();
    }*/
   
}
