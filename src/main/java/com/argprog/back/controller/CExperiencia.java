package com.argprog.back.controller;

import com.argprog.back.entity.Experiencia;
import com.argprog.back.service.SExperiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("experiencia")// localhost:8080/experiencia
@CrossOrigin(origins = "http://localhost:4200")// la ruta se cruza con angular
public class CExperiencia {
    @Autowired
    SExperiencia expeServ;
    
    @GetMapping("/experiencia")  //localhost:8080/experiencia/
    @ResponseBody
    public List<Experiencia>listarExperiencia(){
    return expeServ.listarExperiencia();
    }
    
    @PostMapping ("/experiencia")
    @ResponseBody
    public String crearExperiencia (@RequestBody Experiencia expe) {
      expeServ.crearExperiencia(expe);
      return "La experiencia fue creada correctamente";
    }

    @DeleteMapping("/experiencia/{id}")
    public String borrarExperiencia(@PathVariable int id) {
    expeServ.borrarExperiencia(id);
    return "La experiencia fue eliminada correctamente!!";
    }
    
    @GetMapping("/experiencia{id}")
    @ResponseBody
    public Experiencia buscarExperienciaPorId(@PathVariable int id){
    return expeServ.buscarExperienciaPorId(id);
    }
    
    @PutMapping("/experiencia")
    public String modificarExperiencia(@RequestBody Experiencia expe){
    expeServ.modificarExperiencia(expe);
    return "La experiencia fue modificada correctamente!!";
    }
}
        

