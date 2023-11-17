package utn.dacs.ms.bff.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class SponsorDTO {
    private Long idSponsor;
    private String nombre;
    private String logo;
    private String nivelSponsor;
}
