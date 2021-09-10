package org.sarahEckenrode.caseManager.controllers;

import java.util.List;

import org.sarahEckenrode.caseManager.models.Address;
import org.sarahEckenrode.caseManager.models.Cases;
import org.sarahEckenrode.caseManager.models.Contact;
import org.sarahEckenrode.caseManager.repositories.AddressRepository;
import org.sarahEckenrode.caseManager.repositories.ContactRepository;
import org.sarahEckenrode.caseManager.services.AddressService;
import org.sarahEckenrode.caseManager.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddressController {
	
	private ContactService contactService;
	private AddressService addressService;
	
	public AddressController(ContactService contactService, AddressService addressService){
		this.addressService = addressService;
		this.contactService = contactService; 
	}
	
	@Autowired
	ContactRepository contactRepository;
	
	@Autowired
	AddressRepository addressRepository;
		
	//Gets the edit address form
	@GetMapping("/address/new")
	public String showEditAddressPage(Model model) {
		List<Contact> listContacts = contactService.findAll();
		model.addAttribute("newAddress", new Address());
		model.addAttribute("listContacts", listContacts);
		return "register_address";
	}
	
	//Saves New Addresses
	@PostMapping("/address/save")
	public String registerNewAddress(Address newAddress) {
		addressRepository.save(newAddress);
		return "redirect:/contacts";
	}

//	//Gets the edit cases form
//	@GetMapping("/address/edit/{id}")
//	public String showEditAddressPage(@PathVariable("id") Integer id, Model model) {
//		Address newAddress = addressRepository.findById(id).get();
//		model.addAttribute("newAddress", newAddress);
//		List<Contact> listContacts = contactService.findAll();
//		model.addAttribute("listContacts", listContacts);
//	
//		return "register_address";
//	}
////	
//	//Saves the edited case
//	@PostMapping("/cases/address/save")
//	public String editCase(Cases newCase) {
//		caseRepository.save(newCase);
//		return "redirect:/cases";
//	}
	
//	//Gets the edit address form
//	@GetMapping("/contacts/address/{id}")
//	public String showEditAddressPage(@PathVariable("id") Integer id, Model model) {
//		Contact newContact = contactRepository.findById(id).get();
//		model.addAttribute("newContact", newContact);
//		model.addAttribute("address", new Address());
//	
//		return "register_address";
//	}
	
//	//Saves the edited address
//	@PostMapping("/contacts/address/save")
//	public String editAddress(Contact newContact) {
//		contactRepository.save(newContact);
//		return "redirect:/contacts";
//	}
}
