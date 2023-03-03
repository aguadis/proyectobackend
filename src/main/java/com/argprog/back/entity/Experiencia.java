
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
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;
    
    @Lob
    @Column(name = "trabajo", length = 800)
    private String trabajo;
    
    
    private String inicio;
    
    @Lob
    @Column(name = "puesto", length = 800)
     private String puesto;
   //alt + insert constructor

    public Experiencia() {
    }

    public Experiencia(String trabajo, String inicio, String puesto) {
        this.trabajo = trabajo;
        this.inicio = inicio;
        this.puesto = puesto;
    }

    
    

    

    
    
   
    
    
}
