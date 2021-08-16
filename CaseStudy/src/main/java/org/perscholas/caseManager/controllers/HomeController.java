package org.perscholas.caseManager.controllers;

import javax.validation.Valid;

import org.perscholas.caseManager.models.Staff;
import org.perscholas.caseManager.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	
	private StaffService staffService;
	
	@Autowired
	public HomeController(StaffService staffService) {
		this.staffService = staffService;
	}

	@GetMapping("/")
	public String showIndexPage(){
		return "index";
	}
	
	@GetMapping("/login")
	public String showLoginPage() {
		return "login";
	}
	
	@GetMapping("/logoutSuccess")
	public String showlogoutPage() {
		return "logout_success";
	}
	
	@GetMapping("/register")
	public String showRegisterPage(Model model) {
		model.addAttribute("newStaff",new Staff());
		return "register";
	}
	
  	@PostMapping("/registerNewStaff")
	public String registerNewUser(@Valid @ModelAttribute("newStaff") Staff newStaff, 
			BindingResult result) {
		if (result.hasErrors()) {
			return "register";
		}
		Staff staff = staffService.save(newStaff);
		return "redirect:/login";
	}
}
