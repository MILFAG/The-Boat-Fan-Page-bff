package utn.dacs.ms.bff.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ResultadoDTO {
    @JsonAlias("red")
    @JsonProperty("rojo")
    int rojo;
    @JsonAlias("blue")
    @JsonProperty("azul")
    int azul;

}
