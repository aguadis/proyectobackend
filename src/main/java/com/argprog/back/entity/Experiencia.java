
package com.argprog.back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     
     int id;
     String trabajo;
     Date inicio;
     String puesto;
   //alt + insert constructor

    public Experiencia() {
    }

    public Experiencia(int id, String trabajo, Date inicio, String puesto) {
        this.id = id;
        this.trabajo = trabajo;
        this.inicio = inicio;
        this.puesto = puesto;
    }

    
    

    

    
    
   
    
    
}
