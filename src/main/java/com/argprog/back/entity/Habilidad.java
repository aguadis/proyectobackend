package com.argprog.back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    int id;
    int porcentaje;
    String habilidad;
    String color;
 
    
   //alt + insert constructor

    public Habilidad() {
    }

    public Habilidad(int id, int porcentaje, String habilidad, String color) {
        this.id = id;
        this.porcentaje = porcentaje;
        this.habilidad = habilidad;
        this.color = color;
    }
}
