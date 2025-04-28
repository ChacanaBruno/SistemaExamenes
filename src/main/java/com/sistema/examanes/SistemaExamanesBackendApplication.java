package com.sistema.examanes;

import com.sistema.examanes.entities.Rol;
import com.sistema.examanes.entities.User;
import com.sistema.examanes.entities.UserRol;
import com.sistema.examanes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SistemaExamanesBackendApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(SistemaExamanesBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*esto deberia ser un test.*/
/*
		User user = new User();

		user.setUsername("bach");
		user.setPassword("12345");
		user.setFirstName("Bruno");
		user.setLastName("Chacana");
		user.setEmail("admin@admin.com");
		user.setPhone("123456789");
		user.setProfile("photo.png");

		Rol rol = new Rol();
		rol.setRolId(1L);
		rol.setRolName("Administrator");

		Set<UserRol> userRoles = new HashSet<>();

		UserRol userRol = new UserRol();

		userRol.setRol(rol);
		userRol.setUser(user);

		userRoles.add(userRol);
		User userSaved = userService.saveUser(user, userRoles);

		System.out.println(userSaved.getUsername());
	*/
	}

}
