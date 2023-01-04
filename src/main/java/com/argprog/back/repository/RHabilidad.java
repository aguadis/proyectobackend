package com.argprog.back.repository;

import com.argprog.back.entity.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHabilidad extends JpaRepository <Habilidad, Integer>{
    
    

    
}
