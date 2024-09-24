package com.sistema_examenes_backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sistema_examenes_backend.sistema_examenes_backend.modelos.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    public Usuario findByUsername(String username);
}
