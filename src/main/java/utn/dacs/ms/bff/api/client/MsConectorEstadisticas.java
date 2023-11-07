package utn.dacs.ms.bff.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import utn.dacs.ms.bff.dto.PartidaDTO;
import utn.dacs.ms.bff.dto.RespuestaDTO;

import java.util.List;

@FeignClient(
        name = "msConectorEstadisticas",
        url = "${feign.client.config.msConectorEstadisticas.url}"
)
public interface MsConectorEstadisticas {
    @GetMapping("/partidas/{nombre}/{tag}")
    RespuestaDTO<PartidaDTO> partidas(@PathVariable String nombre, @PathVariable String tag);
}
