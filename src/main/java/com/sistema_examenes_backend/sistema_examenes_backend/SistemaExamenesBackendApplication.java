package com.sistema_examenes_backend.sistema_examenes_backend;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @EnableJpaRepositories(basePackages = "com.sistema_examenes_backend.repositorios")
// @ComponentScan(basePackages = {"com.sistema_examenes_backend.servicios", "com.sistema_examenes_backend.sistema_examenes_backend"})
public class SistemaExamenesBackendApplication{

	// @Autowired
	// private UsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(SistemaExamenesBackendApplication.class, args);
	}

	// @Override
	// public void run(String... args) throws Exception {
	// 	// Usuario usuario = new Usuario();

	// 	// usuario.setNombre("Cristian");
	// 	// usuario.setApellido("Rodriguez");
	// 	// usuario.setUsername("cristial");
	// 	// usuario.setPassword("12345");
	// 	// usuario.setEmail("cristial@gmail.com");
	// 	// usuario.setTelefono("30454584345");
	// 	// usuario.setPerfil("Foto.png");

	// 	// Rol rol = new Rol();

	// 	// rol.setRolId(1L);
	// 	// rol.setNombre("Administrador");

	// 	// Set<UsuarioRol> usuarioRoles = new HashSet<>();
	// 	// UsuarioRol usuarioRol = new UsuarioRol();
	// 	// usuarioRol.setRol(rol);
	// 	// usuarioRol.setUsuario(usuario);
	// 	// usuarioRoles.add(usuarioRol);

	// 	// Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario, usuarioRoles);
	// 	// System.out.println(usuarioGuardado.getUsername());

	// }

}
