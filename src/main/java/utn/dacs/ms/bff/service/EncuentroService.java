package utn.dacs.ms.bff.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.dacs.ms.bff.api.client.MsBackend;
import utn.dacs.ms.bff.dto.EncuentroDTO;

import java.util.List;

@Service
public class EncuentroService {
    @Autowired
    MsBackend msBackend;

    public List<EncuentroDTO> encuentros(){
        return msBackend.encuentros();
    }
    public EncuentroDTO encuentro(int id){
        return msBackend.encuentro(id);
    }
    public EncuentroDTO agregarEncuentro(EncuentroDTO encuentro){
        return msBackend.agregarEncuentro(encuentro);
    }
    public EncuentroDTO modificarEncuentro(EncuentroDTO encuentro){
        return  msBackend.modificarEncuentro(encuentro);
    }
    public List<EncuentroDTO> proximos(){
        return  msBackend.proximos();
    }

    public String eliminarEncuentro(int id){
        return msBackend.eliminarEncuentro(id);
    }


}

