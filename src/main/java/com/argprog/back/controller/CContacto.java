package com.argprog.back.controller;

import com.argprog.back.entity.Contacto;

import com.argprog.back.service.SContacto;
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
@CrossOrigin(origins = "https://proyecto-cintianecol.web.app/")// la ruta se cruza con angular
public class CContacto {
    
    @Autowired
    SContacto contServ;
    
    @GetMapping("/contacto")  //localhost:8080/persona/
    @ResponseBody
    public List<Contacto>listarContacto(){
    return contServ.listarContacto();
    }
    
    @PostMapping ("/contacto")
    @ResponseBody
    public String crearContacto (@RequestBody Contacto cont) {
      contServ.crearContacto(cont);
      return "El contacto fue creado correctamente";
    }

    @DeleteMapping("/contacto/{id}")
    public void borrarContacto(@PathVariable int id) {
    contServ.borrarContacto(id);
    }
    
    @GetMapping("/contacto/{id}")
    @ResponseBody
    public Contacto buscarContactoPorId(@PathVariable int id){
    return contServ.buscarContactoPorId(id);
    }
    
    @PutMapping("/contacto")
    public void modificarContacto(@RequestBody Contacto cont){
    contServ.modificarContacto(cont);
    }
    
}
