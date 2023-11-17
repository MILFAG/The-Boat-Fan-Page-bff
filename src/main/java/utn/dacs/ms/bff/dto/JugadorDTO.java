package utn.dacs.ms.bff.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Date;
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class JugadorDTO {
    private Long id;
    private String usuario;
    private String tag;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String nombreAgente;


}
