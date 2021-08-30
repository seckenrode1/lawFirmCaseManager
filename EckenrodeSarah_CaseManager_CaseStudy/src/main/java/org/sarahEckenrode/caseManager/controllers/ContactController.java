package org.sarahEckenrode.caseManager.controllers;

import java.util.List;

import javax.validation.Valid;

import org.sarahEckenrode.caseManager.models.Address;
import org.sarahEckenrode.caseManager.models.Cases;
import org.sarahEckenrode.caseManager.models.Contact;
import org.sarahEckenrode.caseManager.repositories.ContactRepository;
import org.sarahEckenrode.caseManager.services.AddressService;
import org.sarahEckenrode.caseManager.services.CaseService;
import org.sarahEckenrode.caseManager.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {
	
	@Autowired
	ContactRepository contactRepository;

	private ContactService contactService;
	private CaseService caseService;
	private AddressService addressService;
	
	@Autowired
	public ContactController(ContactService contactService, CaseService caseService, AddressService addressService) {
		this.contactService = contactService;
		this.caseService = caseService;
		this.addressService = addressService;
	}
	
	//Gets the new contact form
	@GetMapping("/contacts/new")
	public String showRegisterContactPage(Model model) {
		model.addAttribute("newContact",new Contact());
//		model.addAttribute("address", new Address());
		return "register_contact";
	}
	
	//Saves New Contact
	@PostMapping("/contacts/save")
	public String registerNewContact(Contact newContact) {
		contactRepository.save(newContact);
		return "redirect:/contacts";
	}
  	
	//Gets the edit contacts form
	@GetMapping("/contacts/edit/{id}")
	public String showEditContactPage(@PathVariable("id") Integer id, Model model) {
		Contact newContact = contactRepository.findById(id).get();
		model.addAttribute("newContact", newContact);
	
		return "register_contact";
	}
	
	//Saves the edited contact
	@PostMapping("/contacts/edit/save")
	public String editContact(Contact newContact) {
		contactRepository.save(newContact);
		return "redirect:/contacts";
	}
  	
	//Displays all contacts
  	@RequestMapping("/contacts")
  	public String showContactsPage(Model model, String keyword) {
      if(keyword != null) {
    	model.addAttribute("contacts", contactService.findByKeyword(keyword));
    }
    else
    {
    model.addAttribute("contacts", contactService.findAll());
    }
    return "contacts";
        
  	}

  	// Deletes a contact
    @RequestMapping(value = "/delete-contact/{id}")
    public String deleteContact(@PathVariable Integer id) {
        contactService.deleteById(id);
        return "redirect:/contacts";
    }
    
    //Gets the page that shows contact infomation
	@GetMapping("/viewContact/{id}")
	public String showContactPage(@PathVariable Integer id, Model model) {
	    model.addAttribute("contact", contactService.findById(id));
	    List<Address> listAddresses = addressService.findByContactId(id);
	    model.addAttribute("listAddresses", listAddresses);
		return "view_contact";
	}

    
//    @GetMapping("/search_contacts")
//    public String getContacts(Model model, String keyword) {
//        
//        if(keyword != null) {
//        	model.addAttribute("contact", contactService.findByKeyword(keyword));
//        }
//        else
//        {
//        model.addAttribute("contact", contactService.findAll());
//        }
//        return "search_contacts";
//    }
}
