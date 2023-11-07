package utn.dacs.ms.bff.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class DañoDTO {
    @JsonAlias("made")
    @JsonProperty("hecho")
    int hecho;
    @JsonAlias("received")
    @JsonProperty("recibido")
    int recibido;
}
