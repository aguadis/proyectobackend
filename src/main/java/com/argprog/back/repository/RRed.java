package com.argprog.back.repository;

import com.argprog.back.entity.Red;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RRed extends JpaRepository <Red, Integer> {
    
}
