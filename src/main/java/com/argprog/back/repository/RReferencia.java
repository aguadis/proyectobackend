package com.argprog.back.repository;

import com.argprog.back.entity.Referencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RReferencia extends JpaRepository <Referencia, Integer> {
    

}
