
package com.argprog.back.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;
    @Basic
     String nombre;
     String apellido;
     String url_banner;
     String foto_perfil;
     @Lob
     String acerca;
     String email;
     String password;
     String frase;
    //alt + insert constructor

    public Persona() {
    }
     public Persona(int id, String nombre, String apellido, String url_banner, String foto_perfil, String acerca, String email, String password, String frase) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.url_banner = url_banner;
        this.foto_perfil = foto_perfil;
        this.acerca = acerca;
        this.email = email;
        this.password = password;
        this.frase = frase;
    }

    
}
