package com.argprog.back.repository;

import com.argprog.back.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPersona extends JpaRepository <Persona, Integer>{
public Persona findByEmailAndPassword(String email, String password);
}
