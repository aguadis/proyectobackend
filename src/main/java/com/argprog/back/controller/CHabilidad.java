package com.argprog.back.controller;

import com.argprog.back.entity.Habilidad;
import com.argprog.back.service.SHabilidad;
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

public class CHabilidad {
    @Autowired
    SHabilidad habiServ;
    
    @GetMapping("/habilidad")  //localhost:8080/habilidad/
    @ResponseBody
    public List<Habilidad>listarHabilidad(){
    return habiServ.listarHabilidad();
    }
    
    @PostMapping ("/habilidad")
    @ResponseBody
    public String crearHabilidad (@RequestBody Habilidad habi) {
      habiServ.crearHabilidad(habi);
      return "La habilidad fue creada correctamente";
    }

    @DeleteMapping("/habilidad/{id}")
    public void borrarHabilidad(@PathVariable int id) {
    habiServ.borrarHabilidad(id);
    }
    
    @GetMapping("/habilidad/{id}")
    @ResponseBody
    public Habilidad buscarHabilidadPorId(@PathVariable int id){
    return habiServ.buscarHabilidadPorId(id);
    }
    
    @PutMapping("/habilidad")
    public void modificarHabilidad(@RequestBody Habilidad habi){
    habiServ.modificarHabilidad(habi);
    }
}
    

