package org.sarahEckenrode.caseManager;

import org.sarahEckenrode.caseManager.models.User;
import org.sarahEckenrode.caseManager.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SeattleSecurityEncryptRolesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeattleSecurityEncryptRolesApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner insertEmployeeRecords(UserService userService) {
		return args -> {


			User user = null;
			user = new User("admin", "password", "Sarah", "Eckenrode", "s@email");
			user.setUserRole("ROLE_ADMIN");
			userService.save(user);	};
	}
}
