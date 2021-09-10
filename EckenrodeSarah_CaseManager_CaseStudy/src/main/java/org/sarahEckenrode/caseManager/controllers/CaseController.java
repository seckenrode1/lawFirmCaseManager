package org.sarahEckenrode.caseManager.controllers;

import java.util.List;

import javax.validation.Valid;

import org.sarahEckenrode.caseManager.models.Address;
import org.sarahEckenrode.caseManager.models.Cases;
import org.sarahEckenrode.caseManager.models.Contact;
import org.sarahEckenrode.caseManager.repositories.CaseRepository;
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
public class CaseController {

	@Autowired
	CaseRepository caseRepository;
	
	private CaseService caseService;
	private ContactService contactService;
	private AddressService addressService;
	
	@Autowired
	public CaseController(CaseService caseService, ContactService contactService, AddressService addressService) {
		this.caseService = caseService;
		this.contactService = contactService;
		this.addressService = addressService;
	}
	
	//Gets the register case form for new cases and editing cases
	@GetMapping("/cases/new")
	public String showRegisterCasePage(Model model) {
		List<Contact> listContacts = contactService.findAll();
		model.addAttribute("newCase",new Cases());
		model.addAttribute("listContacts", listContacts);
		return "register_case";
	}
	
	//Saves New Cases
	@PostMapping("/cases/save")
	public String registerNewCase(Cases newCase) {
		caseRepository.save(newCase);
		return "redirect:/cases";
	}
	
	//Gets the edit cases form
	@GetMapping("/cases/edit/{id}")
	public String showEditContactPage(@PathVariable("id") Integer id, Model model) {
		Cases newCase = caseRepository.findById(id).get();
		model.addAttribute("newCase", newCase);
		List<Contact> listContacts = contactService.findAll();
		model.addAttribute("listContacts", listContacts);
	
		return "register_case";
	}
	
	//Saves the edited case
	@PostMapping("/cases/edit/save")
	public String editCase(Cases newCase) {
		caseRepository.save(newCase);
		return "redirect:/cases";
	}
  	
	// Displays all cases
  	@RequestMapping("/cases")
  	public String showCasePage(Model model) {
        model.addAttribute("cases", caseService.findAll());
  		return "cases";
  	}
  	
  	//Displays the individual case information 
	@GetMapping("/viewCase/{id}")
	public String showCasePage(@PathVariable Integer id, Model model) {
	    model.addAttribute("case1", caseService.findByCaseId(id));
	    model.addAttribute("contact", contactService.findById(id));
	    List<Address> listAddresses = addressService.findByContactId(id);
	    model.addAttribute("listAddresses", listAddresses);
		return "view_case";
	}

	// Deletes a case
    @RequestMapping(value = "/delete-case/{id}")
    public String deleteCase(@PathVariable Integer id) {
    	caseService.deleteByCaseId(id);
        return "redirect:/cases";
    }    
    
    //Hmmm
    

//	
//	@RequestMapping("/post/{postid}/comments")
//	public ModelAndView savecomments(@PathVariable("postid") Long id, @ModelAttribute("comment") Comment comments){
//		ModelAndView mav = new ModelAndView("list-posts");
//		Post post = postService.get(id);
//		if(comments != null){
//			comments.setPost(post);
//			commentService.save(comments);
//		}
//		mav.addObject("posts", postService.get());
//		return mav;
//	}
}
