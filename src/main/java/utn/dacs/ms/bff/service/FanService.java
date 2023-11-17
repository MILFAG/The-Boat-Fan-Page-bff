package utn.dacs.ms.bff.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.dacs.ms.bff.api.client.MsBackend;
import utn.dacs.ms.bff.dto.FanDTO;

import java.util.List;

@Service
public class FanService {
    @Autowired
    MsBackend msBackend;

    public List<FanDTO> fans(){
        return msBackend.fans();
    }
    public FanDTO fan(int id){
        return msBackend.fan(id);
    }
    public FanDTO agregarFan(FanDTO fan){
        return msBackend.agregarFan(fan);
    }
    public FanDTO modificarFan(FanDTO fan){
        return  msBackend.modificarFan(fan);
    }
    public String eliminarFan(int id){
        return msBackend.eliminarFan(id);
    }


}

