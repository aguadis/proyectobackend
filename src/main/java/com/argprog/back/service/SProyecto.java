package com.argprog.back.service;

import com.argprog.back.entity.Proyecto;
import com.argprog.back.repository.RProyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SProyecto {
    
    @Autowired
    public RProyecto proyeRepo;

    public List<Proyecto> listarProyecto() {
        return proyeRepo.findAll();
    }

    public Proyecto crearProyecto(Proyecto proye) {
       return proyeRepo.save(proye);
    }

    public void borrarProyecto(int id) {
         proyeRepo.deleteById(id);
    }

    public Proyecto buscarProyectoPorId(int id) {
        return proyeRepo.findById(id).orElse(null);
    }

    public Proyecto modificarProyecto(Proyecto proye) {
        return proyeRepo.save(proye);
    }

}