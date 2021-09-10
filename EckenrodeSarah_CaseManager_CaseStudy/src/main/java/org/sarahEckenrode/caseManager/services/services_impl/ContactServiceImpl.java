package org.sarahEckenrode.caseManager.services.services_impl;


import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.sarahEckenrode.caseManager.models.Contact;
import org.sarahEckenrode.caseManager.repositories.ContactRepository;
import org.sarahEckenrode.caseManager.services.ContactService;
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

	@Override
	public Contact findById(Integer id) {
		Optional<Contact> optContact = contactRepository.findById(id);
		if(optContact.isPresent()) {
			return optContact.get();
		}
		throw new EntityNotFoundException();
	}

	@Override
	public List<Contact> findAll() {
		return (List<Contact>) contactRepository.findAll();
	}
	
	@Override
	public Contact updateContact(Integer id, Contact contact) {
		Contact uc = contactRepository.findById(id).orElse(null);
		uc.setContactFirstName(contact.getContactFirstName());
		uc.setContactLastName(contact.getContactLastName());
		uc.setContactDob(contact.getContactDob());
		uc.setContactEmail(contact.getContactEmail());
		uc.setContactLanguage(contact.getContactLanguage());
		uc.setContactMaritalStatus(contact.getContactMaritalStatus());
		uc.setContactSsn(contact.getContactSsn());
		uc.setContactPhone(contact.getContactPhone());
		return contactRepository.save(uc);
	}
	
	@Override
	public void deleteById(Integer id) {
		contactRepository.deleteById(id);
	}
	
	//Get contacts by keyword
	public List<Contact> findByKeyword(String keyword) {
		return contactRepository.findByKeyword(keyword);
	}
}
