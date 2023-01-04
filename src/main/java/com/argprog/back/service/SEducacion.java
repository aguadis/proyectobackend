package com.argprog.back.service;

import com.argprog.back.entity.Educacion;
import com.argprog.back.repository.REducacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SEducacion {
    
    @Autowired
    REducacion eduRepo;
    public List<Educacion> listarEducacion() {
        return eduRepo.findAll();
    }

    public Educacion crearEducacion(Educacion edu) {
       return eduRepo.save(edu);
    }

    public void borrarEducacion(int id) {
         eduRepo.deleteById(id);
    }

    public Educacion buscarEducacionPorId(int id) {
        return eduRepo.findById(id).orElse(null);
    }

    public Educacion modificarEducacion(Educacion edu) {
        return eduRepo.save(edu);
    }

       
    }

