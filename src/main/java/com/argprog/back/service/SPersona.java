package com.argprog.back.service;

import com.argprog.back.entity.Persona;
import com.argprog.back.repository.RPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SPersona {

    @Autowired
    RPersona persoRepo;
    public List<Persona> listarPersonas() {
        return persoRepo.findAll();
    }

    public Persona crearPersona(Persona perso) {
       return persoRepo.save(perso);
    }

    public void borrarPersona(int id) {
         persoRepo.deleteById(id);
    }

    public Persona buscarPersonaPorId(int id) {
        return persoRepo.findById(id).orElse(null);
    }

    public void modificarPersona(Persona perso) {
         persoRepo.save(perso);
    }
    
  public PersonaDTO login(String email, String password)
  {
 Persona perso= persoRepo.findByEmailAndPassword(email, password);
   PersonaDTO persoDTO= new PersonaDTO(perso.getId(), perso.getNombre(), perso.getApellido(),
    perso.getUrl_banner(), perso.getFoto_perfil(), perso.getAcerca(),perso.getFrase());
        return  persoDTO; 
         }
}
              