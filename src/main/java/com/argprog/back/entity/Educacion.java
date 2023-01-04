package com.argprog.back.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

 @Getter @Setter  
@Entity
public class Educacion {

  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;
    @Basic
     String nivel;
     Date inicio;
     Date fin;
     String estudio;
   //alt + insert constructor

        public Educacion(){
        }

    public Educacion(int id, String nivel, Date inicio, Date fin, String estudio) {
        this.id = id;
        this.nivel = nivel;
        this.inicio = inicio;
        this.fin = fin;
        this.estudio = estudio;
    }

    
    }

    

        
 
   
    
    
    
    

   
   
