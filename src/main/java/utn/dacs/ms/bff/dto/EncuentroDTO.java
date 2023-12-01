package utn.dacs.ms.bff.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Date;
import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class EncuentroDTO {
    private Long id;
    private Date fecha;
    private String rival;
    private String imagenRival;

  //  private List<JugadorDTO> jugadores;
}
