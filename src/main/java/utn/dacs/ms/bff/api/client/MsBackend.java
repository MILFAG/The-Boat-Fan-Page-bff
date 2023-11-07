package utn.dacs.ms.bff.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "msBackend",
        url = "${feign.client.config.msBackend.url}"
)
public interface MsBackend {

}
