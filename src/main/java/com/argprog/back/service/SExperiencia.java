package com.argprog.back.service;

import com.argprog.back.entity.Experiencia;
import com.argprog.back.repository.RExperiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SExperiencia {
    
    @Autowired
     RExperiencia expeRepo;

    public List<Experiencia> listarExperiencia() {
        return expeRepo.findAll();
    }

    public void crearExperiencia(Experiencia expe) {
        expeRepo.save(expe);
    }

    public void borrarExperiencia(int id) {
         expeRepo.deleteById(id);
    }

    public Experiencia buscarExperienciaPorId(int id) {
        return expeRepo.findById(id).orElse(null);
    }

    public void modificarExperiencia(Experiencia expe) {
         expeRepo.save(expe);
    }

   

}
              