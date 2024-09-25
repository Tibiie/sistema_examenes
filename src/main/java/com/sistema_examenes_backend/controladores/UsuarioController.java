package com.sistema_examenes_backend.controladores;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistema_examenes_backend.servicios.UsuarioService;
import com.sistema_examenes_backend.sistema_examenes_backend.modelos.Rol;
import com.sistema_examenes_backend.sistema_examenes_backend.modelos.Usuario;
import com.sistema_examenes_backend.sistema_examenes_backend.modelos.UsuarioRol;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    
    @PostMapping("/")
    public Usuario guardarUsuario(@RequestBody Usuario usuario) throws Exception {
        Set<UsuarioRol> roles = new HashSet<>();
    
        Rol rol = new Rol();
        rol.setRolId(2L);
        rol.setNombre("Normal");
    
        UsuarioRol usuarioRol = new UsuarioRol();
        usuarioRol.setUsuario(usuario);
        usuarioRol.setRol(rol);
    
        return usuarioService.guardarUsuario(usuario, roles);        
    }    

    @GetMapping("/{username}")
    public Usuario obtenerUsuario(@PathVariable("username") String username) {
        return usuarioService.obtenerUsuario(username);
    }

    @DeleteMapping("/{usuarioId}")
    public void eliminarUsuario(@PathVariable("usuarioId") Long usuarioId) {
        usuarioService.eliminarUsuario(usuarioId);
    }
}

//hola