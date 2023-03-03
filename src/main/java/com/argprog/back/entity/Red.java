
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
public class Red {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;
    @Basic
    
    @Lob
    @Column(name = "clase", length = 800)
    private String clase;
  
    @Lob
    @Column(name = "red", length = 800)
    private String red ;
 
    
   //alt + insert constructor

    public Red() {
    }

    public Red(String clase, String red) {
        
        this.clase = clase;
        this.red = red;
    }

    

    

    

}
