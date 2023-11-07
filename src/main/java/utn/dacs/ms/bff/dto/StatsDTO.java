package utn.dacs.ms.bff.dto;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.xml.transform.Result;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class StatsDTO {
    @JsonAlias("team")
    @JsonProperty("equipo")
    String equipo;
    @JsonAlias("tier")
    @JsonProperty("rango")
    int rango;
    @JsonAlias("score")
    @JsonProperty("puntaje")
    int puntaje;
    @JsonAlias("kills")
    @JsonProperty("asesinatos")
    int asesinatos;
    @JsonAlias("deaths")
    @JsonProperty("muertes")
    int muertes;
    @JsonAlias("assists")
    @JsonProperty("asistencias")
    int asistencias;
    @JsonAlias("shots")
    @JsonProperty("disparos")
    DisparosDTO disparos;
    @JsonAlias("damage")
    @JsonProperty("daño")
    DañoDTO daño;

}