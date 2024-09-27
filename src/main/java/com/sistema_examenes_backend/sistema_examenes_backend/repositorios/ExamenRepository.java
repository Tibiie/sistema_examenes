package com.sistema_examenes_backend.sistema_examenes_backend.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema_examenes_backend.sistema_examenes_backend.modelos.Categoria;
import com.sistema_examenes_backend.sistema_examenes_backend.modelos.Examen;


public interface ExamenRepository extends JpaRepository<Examen, Long>{

    List<Examen> findByCategoria(Categoria categoria);

    List<Examen>  findByActivo(Boolean estado);

    List<Examen> findByCategoriaAndActivo(Categoria categoria, Boolean estado);
}
