package utn.dacs.ms.bff.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.dacs.ms.bff.api.client.MsBackend;
@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@Slf4j
public class JugadorController {
    @Autowired
    MsBackend msBackend;
}
