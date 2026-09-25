package com.example.beta_1_synkro.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface IRepositorioPrioridad extends JpaRepository<Prioridad,UUID>{
    
}
