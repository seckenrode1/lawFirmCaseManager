package org.sarahEckenrode.caseManager.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.sarahEckenrode.caseManager.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;


@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ServiceTests {

	private UserService userService;
	private User expected;
	
	@Autowired
	public ServiceTests(UserService userService) {
		this.userService = userService;
	}
	
	@BeforeAll
	void setup() {
		User u = new User("John","john1234", "John", "Smith", "john@email.com");
		expected = userService.save(u);
	}
	
	@AfterAll
	void clearSetup() {
		userService.deleteByUserId(expected.getUserId());
	}
	
	@Test
	void testFindByUsername() {
		User actual = userService.findByUsername(expected.getUsername());
		assertEquals(expected, actual);
	}
	
}
