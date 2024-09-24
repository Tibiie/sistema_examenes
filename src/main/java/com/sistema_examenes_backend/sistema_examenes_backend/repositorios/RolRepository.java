package com.sistema_examenes_backend.sistema_examenes_backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistema_examenes_backend.sistema_examenes_backend.modelos.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long>{
    

}
