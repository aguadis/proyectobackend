package com.argprog.back.entity;

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
public class Referencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;
    @Lob
    @Column(name = "nombre", length = 800)
     private String nombre;
    
    @Lob
    @Column(name = "apellido", length = 800)
     private String apellido;
    
    @Lob
    @Column(name = "cargo", length = 800)
    private String cargo;
    
    @Lob
    @Column(name = "contacto", length = 800)
    private String contacto;

    public Referencia() {
    }

    

    public Referencia(String nombre,String apellido, String cargo, String contacto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.contacto = contacto;
    }
    

   
    }
   
    
    
    

