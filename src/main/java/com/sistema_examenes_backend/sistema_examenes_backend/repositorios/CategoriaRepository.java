package com.sistema_examenes_backend.sistema_examenes_backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema_examenes_backend.sistema_examenes_backend.modelos.Categoria;

public interface CategoriaRepository extends  JpaRepository<Categoria, Long>{

}
