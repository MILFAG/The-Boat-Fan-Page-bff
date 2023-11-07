package utn.dacs.ms.bff.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class AgenteDTO {
    @JsonAlias("uuid")
    @JsonProperty("id")
    String id;
    @JsonAlias("displayName")
    @JsonProperty("nombre")
    String nombre;
    @JsonAlias("description")
    @JsonProperty("descripcion")
    String descripcion;
    @JsonAlias("displayIcon")
    @JsonProperty("imagenCara")
    String imagenCara;
    @JsonAlias("bustPortrait")
    @JsonProperty("imagenCompleta")
    String imagenCompleta;
    @JsonAlias("backgroundGradientColors")
    @JsonProperty("coloresGradiente")
    String[] coloresGradiente;


}
