package com.argprog.back.controller;

import com.argprog.back.entity.Educacion;
import com.argprog.back.service.SEducacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = {"http://portfoliocintianecol.web.app/"})// la ruta se cruza con angular

public class CEducacion {
    @Autowired
    SEducacion eduServ;
    
   
    
    @GetMapping("/educacion")  //localhost:8080/educacion/
    @ResponseBody
    public List<Educacion>listarEducacion(){
    return eduServ.listarEducacion();
    }
    
    @PostMapping ("/educacion")
    @ResponseBody
    public String crearEducacion (@RequestBody Educacion edu) {
      eduServ.crearEducacion(edu);
      return "La educacion fue creada correctamente";
    }

    @DeleteMapping("/educacion/{id}")
    public void borrarEducacion(@PathVariable int id) {
    eduServ.borrarEducacion(id);
    }
    
    @GetMapping("/educacion/{id}")
    @ResponseBody
    public Educacion buscarEducacionPorId(@PathVariable int id){
    return eduServ.buscarEducacionPorId(id);
    }
    
    @PutMapping("/educacion")
    public void modificarEducacion(@RequestBody Educacion edu){
    eduServ.modificarEducacion(edu);
    }
}   
    
