
package com.argprog.back.service;

import com.argprog.back.entity.Contacto;
import com.argprog.back.repository.RContacto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SContacto {

    @Autowired
    RContacto contRepo;
    public List<Contacto> listarContacto() {
        return contRepo.findAll();
    }

    public Contacto crearContacto(Contacto cont) {
       return contRepo.save(cont);
    }

    public void borrarContacto(int id) {
         contRepo.deleteById(id);
    }

    public Contacto buscarContactoPorId(int id) {
        return contRepo.findById(id).orElse(null);
    }

    public Contacto modificarContacto(Contacto cont) {
        return contRepo.save(cont);
    }
}
