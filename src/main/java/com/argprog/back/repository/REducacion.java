package com.argprog.back.repository;

import com.argprog.back.entity.Educacion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface REducacion extends JpaRepository <Educacion, Integer>{

    
}