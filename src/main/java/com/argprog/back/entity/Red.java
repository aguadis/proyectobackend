
package com.argprog.back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Red {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;
    
     String clase;
  
     String red ;
 
    
   //alt + insert constructor

    public Red() {
    }

    public Red(int id, String clase, String red) {
        this.id = id;
        this.clase = clase;
        this.red = red;
    }

    

    

    

}
