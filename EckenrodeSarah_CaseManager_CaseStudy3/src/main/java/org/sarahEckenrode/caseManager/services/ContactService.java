package org.sarahEckenrode.caseManager.services;

import java.util.List;

import org.sarahEckenrode.caseManager.models.Contact;

public interface ContactService {
	
	Contact save(Contact contact);
	Contact findById(Integer id);
	List<Contact> findAll();
	Contact updateContact(Integer id, Contact contact);
	void deleteById(Integer id);
	List<Contact> findByKeyword(String keyword);
}
