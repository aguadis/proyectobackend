package com.argprog.back.controller;


import com.argprog.back.entity.Proyecto;
import com.argprog.back.service.SProyecto;
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
@CrossOrigin(origins = {"http://portfoliocintianecol.web.app/"})// la ruta se cruza con angularpackage com.argprog.back.controller;

public class CProyecto {
   @Autowired
   SProyecto proyeServ;
    
    @GetMapping("/proyecto")  //localhost:8080/proyecto/
    @ResponseBody
    public List<Proyecto>listarProyecto(){
    return proyeServ.listarProyecto();
    }
    
    @PostMapping ("/proyecto")
    @ResponseBody
    public String crearProyecto (@RequestBody Proyecto proye) {
      proyeServ.crearProyecto(proye);
      return "El proyecto fue creado correctamente";
    }

    @DeleteMapping("/proyecto/{id}")
    public void borrarProyecto(@PathVariable int id) {
    proyeServ.borrarProyecto(id);
    }
    
    @GetMapping("/Proyecto/{id}")
    @ResponseBody
    public Proyecto buscarProyectoPorId(@PathVariable int id){
    return proyeServ.buscarProyectoPorId(id);
    }
    
    @PutMapping("/proyecto")
    public void modificarProyecto(@RequestBody Proyecto proye){
    proyeServ.modificarProyecto(proye);
    }
}
