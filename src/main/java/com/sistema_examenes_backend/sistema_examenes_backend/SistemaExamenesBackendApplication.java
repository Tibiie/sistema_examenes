package com.sistema_examenes_backend.sistema_examenes_backend;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.sistema_examenes_backend.sistema_examenes_backend.excepciones.UsuarioFoundException;
import com.sistema_examenes_backend.sistema_examenes_backend.modelos.Rol;
import com.sistema_examenes_backend.sistema_examenes_backend.modelos.Usuario;
import com.sistema_examenes_backend.sistema_examenes_backend.modelos.UsuarioRol;
import com.sistema_examenes_backend.sistema_examenes_backend.servicios.UsuarioService;

@SpringBootApplication
public class SistemaExamenesBackendApplication implements CommandLineRunner {

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SistemaExamenesBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			// try {
			// 	Usuario usuario = new Usuario();

			// 	usuario.setNombre("Yurani");
			// 	usuario.setApellido("Echeverri");
			// 	usuario.setUsername("Tibiie");
			// 	usuario.setPassword(bCryptPasswordEncoder.encode("12345"));
			// 	usuario.setEmail("yurani@gmail.com");
			// 	usuario.setTelefono("3044471789");
			// 	usuario.setPerfil("foto.png");

			// 	Rol rol = new Rol();
			// 	rol.setRolId(1L);
			// 	rol.setNombre("Administrador");

			// 	Set<UsuarioRol> usuariosRoles = new HashSet<>();
			// 	UsuarioRol usuarioRol = new UsuarioRol();
			// 	usuarioRol.setRol(rol);
			// 	usuarioRol.setUsuario(usuario);
			// 	usuariosRoles.add(usuarioRol);

			// 	Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario,usuariosRoles);
			// 	System.out.println(usuarioGuardado.getUsername());

			// } catch (UsuarioFoundException exception) {
			// 	exception.printStackTrace();
			// }
	}
}