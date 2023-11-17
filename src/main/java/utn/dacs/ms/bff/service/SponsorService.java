package utn.dacs.ms.bff.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.dacs.ms.bff.api.client.MsBackend;
import utn.dacs.ms.bff.dto.SponsorDTO;

import java.util.List;

@Service
public class SponsorService {
    @Autowired
    MsBackend msBackend;

    public List<SponsorDTO> sponsors(){
        return msBackend.sponsors();
    }
    public SponsorDTO sponsor(int id){
        return msBackend.sponsor(id);
    }
    public SponsorDTO agregarSponsor(SponsorDTO sponsor){
        return msBackend.agregarSponsor(sponsor);
    }
    public SponsorDTO modificarSponsor(SponsorDTO sponsor){
        return  msBackend.modificarSponsor(sponsor);
    }
    public String eliminarSponsor(int id){
        return msBackend.eliminarSponsor(id);
    }


}
