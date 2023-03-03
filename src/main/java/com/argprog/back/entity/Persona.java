
package com.argprog.back.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
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
     @Lob
    @Column(name = "nombre", length = 800)
    private String nombre;
    
    @Lob
    @Column(name = "apellido", length = 800)
    private String apellido;
    
    @Lob
    @Column(name = "url_banner", length = 800)
    private String url_banner;
    
    @Lob
    @Column(name = "foto_perfil", length = 800)
    private String foto_perfil;
    
    @Lob
    @Column(name = "acerca", length = 800)
    private String acerca;
    
    private String email;
    private String password;
    
    @Lob
    @Column(name = "frase", length = 800)
    private String frase;
    //alt + insert constructor

    public Persona() {
    }
     public Persona(String nombre, String apellido, String url_banner, String foto_perfil, String acerca, String email, String password, String frase) {
        
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
