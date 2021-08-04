package org.perscholas.caseManager.services.Impl;


import org.perscholas.caseManager.models.Contact;
import org.perscholas.caseManager.repositories.ContactRepository;
import org.perscholas.caseManager.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService{
	private ContactRepository contactRepository;
	
	@Autowired
	public ContactServiceImpl(ContactRepository contactRepository) {
		this.contactRepository = contactRepository;
	}
	
	@Override
	public Contact save(Contact contact) {
		return contactRepository.save(contact);
	}
}
