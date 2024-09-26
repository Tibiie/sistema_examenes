package com.sistema_examenes_backend.sistema_examenes_backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema_examenes_backend.sistema_examenes_backend.modelos.Examen;

public interface ExamenRepository extends JpaRepository<Examen, Long>{
    
}
