package com.argprog.back.controller;

import com.argprog.back.entity.Red;
import com.argprog.back.service.SRed;
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
@CrossOrigin(origins = "http://portfoliocintianecol.web.app")// la ruta se cruza con angular
public class CRed {
    @Autowired
    SRed redServ;
    
    @GetMapping("/red")  //localhost:8080/Red/
    @ResponseBody
    public List<Red>listarRed(){
    return redServ.listarRed();
    }
    
    @PostMapping ("/red")
    @ResponseBody
    public String crearRed (@RequestBody Red red) {
      redServ.crearRed(red);
      return "La red fue creada correctamente";
    }

    @DeleteMapping("/red/{id}")
    public void borrarRed(@PathVariable int id) {
    redServ.borrarRed(id);
    }
    
    @GetMapping("/red/{id}")
    @ResponseBody
    public Red buscarRedPorId(@PathVariable int id){
    return redServ.buscarRedPorId(id);
    }
    
    @PutMapping("/red")
    public void modificarRed(@RequestBody Red red){
    redServ.modificarRed(red);
    }
}   