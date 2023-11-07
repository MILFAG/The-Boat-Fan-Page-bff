package utn.dacs.ms.bff.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class PartidaDTO {
    @JsonAlias("meta")
    @JsonProperty("metadata")
    MetadataDTO metadata;
    @JsonAlias("stats")
    @JsonProperty("stats")
    StatsDTO stats;
    @JsonAlias("teams")
    @JsonProperty("resultados")
    ResultadoDTO resultados;


}
