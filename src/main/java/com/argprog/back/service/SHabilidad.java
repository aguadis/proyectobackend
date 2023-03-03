package com.argprog.back.service;

import com.argprog.back.entity.Habilidad;

import com.argprog.back.repository.RHabilidad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SHabilidad {
    
    @Autowired
     RHabilidad habiRepo;

    public List<Habilidad> listarHabilidad() {
        return habiRepo.findAll();
       }

    public Habilidad crearHabilidad(Habilidad habi) {
       return habiRepo.save(habi);
        
    }

    public void borrarHabilidad(int id) {
        habiRepo.deleteById(id);
    }

    
        public Habilidad buscarHabilidadPorId(int id) {
        return habiRepo.findById(id).orElse(null);
         }

    public Habilidad modificarHabilidad(Habilidad habi) {
        return habiRepo.save(habi);
    }
}
 
    

