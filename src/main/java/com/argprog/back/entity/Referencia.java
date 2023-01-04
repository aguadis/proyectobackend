package com.argprog.back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Referencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;
     String nombre;
     String apellido;
     String cargo;
     String contacto;
    

    public Referencia() {
    }

    public Referencia(int id, String nombre, String apellido, String cargo, String contacto) {
        
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.contacto = contacto;
    }
    
    
    
}
