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
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;
    @Basic
    @Lob
    @Column(name = "correo", length = 800)
    private String correo;
    
    @Lob
    @Column(name = "telefono", length = 800)
    private String telefono;
    
    @Lob
    @Column(name = "img", length = 800)
    private String img;
    
    @Lob
    @Column(name = "frase", length = 800)
    private String frase;
    
    @Lob
    @Column(name = "titulo", length = 800)
    private String titulo;
     
     //alt + insert constructor

    public Contacto() {
    }

    public Contacto(String correo, String telefono, String img, String frase, String titulo) {
       
        this.correo = correo;
        this.telefono = telefono;
        this.img = img;
        this.frase = frase;
        this.titulo = titulo;
    }
    
     
     
     
}
