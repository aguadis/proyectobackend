package com.argprog.back.service;

import com.argprog.back.entity.Referencia;
import com.argprog.back.repository.RReferencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SReferencia {
    
    @Autowired
    RReferencia refeRepo;
    public List<Referencia> listarReferencia() {
        return refeRepo.findAll();
    }

    public Referencia crearReferencia(Referencia refe) {
       return refeRepo.save(refe);
    }

    public void borrarReferencia(int id) {
         refeRepo.deleteById(id);
    }

    public Referencia buscarReferenciaPorId(int id) {
        return refeRepo.findById(id).orElse(null);
    }

    public Referencia modificarReferencia(Referencia refe) {
        return refeRepo.save(refe);
    }


    
    
}
