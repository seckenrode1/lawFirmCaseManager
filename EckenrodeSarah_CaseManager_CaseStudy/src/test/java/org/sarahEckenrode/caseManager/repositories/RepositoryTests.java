package org.sarahEckenrode.caseManager.repositories;



import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.sarahEckenrode.caseManager.models.Address;
import org.sarahEckenrode.caseManager.models.Contact;
import org.sarahEckenrode.caseManager.models.User;
import org.sarahEckenrode.caseManager.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class RepositoryTests {

	@Autowired
	private ContactRepository repo;
	
	private ContactService contactService;
	
	@Autowired
	public RepositoryTests(ContactService contactService){
		this.contactService = contactService;
	}
	
//	@Test
//	public void testCreateContact() {
//		Contact savedContact = repo.save(new Contact("Bob"));
//		assertThat(savedContact.getByContactId()).isGreaterThan(0);
//	}
	
	@BeforeAll
	void setup() {
		Contact c = new Contact(1, "FName", "LastName", "email", "Phone", "DOB", "Language", "MaritalStatus", "SSN");
		contactService.save(c);
		
//		Address a = new Address(1, "Street", "City", "State", "Zip", "Country", c.);
	}
	
	@AfterAll
	void clearSetup() {
	}
	
	
	@Test
	public void testFindByContactId() {
		
	}
}
