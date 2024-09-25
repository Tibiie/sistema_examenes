package com.sistema_examenes_backend.sistema_examenes_backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistema_examenes_backend.sistema_examenes_backend.modelos.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    public Usuario findByUsername(String username);
}
