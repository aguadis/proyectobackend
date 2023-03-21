package com.argprog.back.controller;

import com.argprog.back.entity.Persona;
import com.argprog.back.service.PersonaDTO;
import com.argprog.back.service.SPersona;
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

public class CPersona {
    
    @Autowired
    SPersona persoServ;
    
    @GetMapping("/persona")  //localhost:8080/persona/
    @ResponseBody
    public List<Persona>listarPersona(){
    return persoServ.listarPersonas();
    }
    
    @PostMapping ("/persona")
    @ResponseBody
    public String crearPersona (@RequestBody Persona perso) {
      persoServ.crearPersona(perso);
      return "La persona fue creada correctamente";
    }

    @DeleteMapping("/persona/{id}")
    public void borrarPersona(@PathVariable int id) {
    persoServ.borrarPersona(id);
    }
    
    @GetMapping("/persona/{id}")
    @ResponseBody
    public Persona buscarPersonaPorId(@PathVariable int id){
    return persoServ.buscarPersonaPorId(id);
    }
    
    @PutMapping("/persona")
    public void modificarPersona(@RequestBody Persona perso){
    persoServ.modificarPersona(perso);
    }
    
    @PostMapping("/login")
    public PersonaDTO login (@RequestBody Persona perso)
    {
    return persoServ.login(perso.getEmail(), perso.getPassword());
    }
}   
    



        
       
    
    
    
    

