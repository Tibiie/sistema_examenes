package com.sistema_examenes_backend.servicios.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema_examenes_backend.repositorios.RolRepository;
import com.sistema_examenes_backend.repositorios.UsuarioRepository;
import com.sistema_examenes_backend.servicios.UsuarioService;
import com.sistema_examenes_backend.sistema_examenes_backend.modelos.Usuario;
import com.sistema_examenes_backend.sistema_examenes_backend.modelos.UsuarioRol;

@Service
public class UsuarioServiceImpl implements  UsuarioService{
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RolRepository rolRepository;

    @Override
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception {
        Usuario usuarioLocal = usuarioRepository.findByUsername(usuario.getUsername());
        if (usuarioLocal != null) {
            System.out.println("El usuario ya existe");
            throw new Exception("El usuario ya se encuentra presente");
        }
        else{
            for(UsuarioRol usuarioRol: usuarioRoles){
                rolRepository.save(usuarioRol.getRol());
            }
            usuario.getUsuarioRoles().addAll(usuarioRoles);
            usuarioLocal = usuarioRepository.save(usuario);
        }
        return usuarioLocal;
    }

    @Override
    public void eliminarUsuario(Long usuarioId) {
        usuarioRepository.deleteById(usuarioId);
    }

    @Override
    public Usuario obtenerUsuario(String username) {
        return usuarioRepository.findByUsername(username);
    }

    
}
