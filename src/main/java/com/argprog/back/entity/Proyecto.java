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
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;
    @Basic
    @Lob
    @Column(name = "trabajo", length = 800)
     String trabajo;
    
    
    @Lob
    @Column(name = "img", length = 800)
     String img;

     public Proyecto() {
    }

    public Proyecto(String trabajo, String img) {
       
        this.trabajo = trabajo;
        this.img = img;
    }
    
    
   
    

    
    
    
    
    
    
}
