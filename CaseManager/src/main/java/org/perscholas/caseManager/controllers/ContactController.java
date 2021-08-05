package org.perscholas.caseManager.controllers;

import javax.validation.Valid;

import org.perscholas.caseManager.models.Contact;
import org.perscholas.caseManager.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
public class ContactController {

	private ContactService contactService;
	
	@Autowired
	public ContactController(ContactService contactService) {
		this.contactService = contactService;
	}
	
	@PostMapping("/createContact")
	public String createContact(@Valid @ModelAttribute("contact")Contact contact) {
		Contact savedContact = contactService.save(contact);
		System.out.println(savedContact.toString());
		return "home";
	}
	
}
