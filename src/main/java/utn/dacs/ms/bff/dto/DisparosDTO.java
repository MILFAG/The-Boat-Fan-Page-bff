package utn.dacs.ms.bff.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class DisparosDTO {
    @JsonAlias("head")
    @JsonProperty("cabeza")
    int cabeza;
    @JsonAlias("body")
    @JsonProperty("cuerpo")
    int cuerpo;
    @JsonAlias("leg")
    @JsonProperty("piernas")
    int piernas;
}
