package utn.dacs.ms.bff.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


import java.util.Map;
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class MetadataDTO {
    @JsonAlias("map")
    @JsonProperty("mapa")
    MapaDTO mapa;
    @JsonAlias("started_at")
    @JsonProperty("inicio")
    String inicio;
}
