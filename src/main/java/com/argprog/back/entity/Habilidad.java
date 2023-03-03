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
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    int id;
    
     
   private int porcentaje;
     
      @Lob
    @Column(name = "habilidad", length = 800)
   private String habilidad;
      
       @Lob
    @Column(name = "color", length = 800)
   private String color;
 
    
   //alt + insert constructor

    public Habilidad() {
    }

    public Habilidad(int porcentaje, String habilidad, String color) {
        
        this.porcentaje = porcentaje;
        this.habilidad = habilidad;
        this.color = color;
    }
}
