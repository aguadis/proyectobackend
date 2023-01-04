package com.argprog.back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;
    
     String trabajo;
    
     String img;

     Proyecto() {
    }

    public Proyecto(int id, String trabajo, String img) {
       this.id = id;
        this.trabajo = trabajo;
        this.img = img;
    }
    
    
   
    

    
    
    
    
    
    
}
