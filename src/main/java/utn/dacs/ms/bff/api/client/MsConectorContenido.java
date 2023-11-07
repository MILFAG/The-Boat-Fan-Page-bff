package utn.dacs.ms.bff.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import utn.dacs.ms.bff.dto.AgenteDTO;
import utn.dacs.ms.bff.dto.RespuestaDTO;
import utn.dacs.ms.bff.dto.TiersCompetitivosDTO;

import java.util.List;

@FeignClient(
        name = "msConectorContenido",
        url = "${feign.client.config.msConectorContenido.url}"
)
public interface MsConectorContenido {
    @GetMapping("/rangos")
    public RespuestaDTO<TiersCompetitivosDTO> rangos();
    @GetMapping("/agentes")
    public RespuestaDTO<AgenteDTO> agentes();

}
