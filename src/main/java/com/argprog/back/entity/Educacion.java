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
public class Educacion {

  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;
    @Basic
            @Lob
    @Column(name = "nivel", length = 800)
     String nivel;
     private String inicio;
     private String fin;
     
     @Lob
    @Column(name = "estudio", length = 800)
     private String estudio;
   //alt + insert constructor

        public Educacion(){
        }

    public Educacion(String nivel, String inicio, String fin, String estudio) {
        
        this.nivel = nivel;
        this.inicio = inicio;
        this.fin = fin;
        this.estudio = estudio;
    }

    
    }

    

        
 
   
    
    
    
    

   
   
