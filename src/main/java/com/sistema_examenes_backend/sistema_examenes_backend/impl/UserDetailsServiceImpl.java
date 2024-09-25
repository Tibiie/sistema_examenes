package com.sistema_examenes_backend.sistema_examenes_backend.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.sistema_examenes_backend.sistema_examenes_backend.modelos.Usuario;
import com.sistema_examenes_backend.sistema_examenes_backend.repositorios.UsuarioRepository;

public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = this.usuarioRepository.findByUsername(username);
        if (usuario == null) {
            throw new UsernameNotFoundException("Usuario no encontrado"); 
        }
        return usuario;
    }

}
