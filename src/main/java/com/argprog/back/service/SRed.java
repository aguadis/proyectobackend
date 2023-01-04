package com.argprog.back.service;


import com.argprog.back.entity.Red;
import com.argprog.back.repository.RRed;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SRed {
    
   @Autowired
    RRed redRepo;
   public List<Red> listarRed() {
        return redRepo.findAll();
    }

    public Red crearRed(Red red) {
       return redRepo.save(red);
    }

    public void borrarRed(int id) {
         redRepo.deleteById(id);
    }

    public Red buscarRedPorId(int id) {
        return redRepo.findById(id).orElse(null);
    }

    public Red modificarRed(Red red) {
        return redRepo.save(red);
    }

}
              
    

 

