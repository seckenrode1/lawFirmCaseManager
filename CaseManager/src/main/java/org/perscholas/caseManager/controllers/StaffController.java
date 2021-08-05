package org.perscholas.caseManager.controllers;

import javax.validation.Valid;

import org.perscholas.caseManager.models.Contact;
import org.perscholas.caseManager.models.Staff;
import org.perscholas.caseManager.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
public class StaffController {

	private StaffService staffService;
	
	@Autowired
	public StaffController(StaffService staffService) {
		this.staffService = staffService;
	}

	@GetMapping("/")
	public String showLoginPage(Model model) {
		model.addAttribute("staff", new Staff());
		return "login";
}

	@PostMapping("/createStaff")
	public String createStaff(@Valid @ModelAttribute("staff") Staff staff){
		Staff savedStaff = staffService.createStaff(staff);
		System.out.println(savedStaff.toString());
		return "login";   //redirect:/
}

	@GetMapping("/register")
	public String showRegisterPage(Model model) {
		model.addAttribute("staff", new Staff());
		return "register";
}
	@GetMapping("/home")
	public String showHomePage(Model model) {
		model.addAttribute("contact", new Contact());
		return "home";
	}
}
