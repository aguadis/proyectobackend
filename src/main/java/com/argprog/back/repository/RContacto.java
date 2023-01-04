
package com.argprog.back.repository;

import com.argprog.back.entity.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RContacto extends JpaRepository <Contacto, Integer> {
    
}
