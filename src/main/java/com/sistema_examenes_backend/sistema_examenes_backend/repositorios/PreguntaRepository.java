package com.sistema_examenes_backend.sistema_examenes_backend.repositorios;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema_examenes_backend.sistema_examenes_backend.modelos.Examen;
import com.sistema_examenes_backend.sistema_examenes_backend.modelos.Pregunta;

public interface PreguntaRepository extends  JpaRepository<Pregunta, Long>{

    Set<Pregunta> findByExamen(Examen examen);

}
