package com.argprog.back.service;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PersonaDTO {
     int id;
     String nombre;
     String apellido;
     String url_banner;
     String foto_perfil;
     String acerca;
     String frase;

    public PersonaDTO() {
    }

    
    

    public PersonaDTO(int id, String nombre, String apellido, String url_banner, String foto_perfil, String acerca, String frase) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.url_banner = url_banner;
        this.foto_perfil = foto_perfil;
        this.acerca = acerca;
        this.frase = frase;
  
    }

 }
