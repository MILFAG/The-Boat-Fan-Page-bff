package utn.dacs.ms.bff.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class FanDTO {
    private Long id;
    private String nombre;
    private String correo;
    private List<JugadorDTO> favoritos;
}
