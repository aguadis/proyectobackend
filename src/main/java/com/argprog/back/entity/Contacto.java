package com.argprog.back.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;
    @Basic
    String correo;
     String telefono;
     String img;
     String frase;
     String titulo;
     
     //alt + insert constructor

    public Contacto() {
    }

    public Contacto(int id, String correo, String telefono, String img, String frase, String titulo) {
        this.id = id;
        this.correo = correo;
        this.telefono = telefono;
        this.img = img;
        this.frase = frase;
        this.titulo = titulo;
    }
    
     
     
     
}
