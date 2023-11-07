package utn.dacs.ms.bff.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class EstadisticasDTO {
    int rango;
    int ACS;
    float kd;
    float porcHs;
    int deltaDaño;
    float porcVictorias;


}
