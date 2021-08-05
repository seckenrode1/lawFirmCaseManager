package org.perscholas.caseManager.controllers;

import javax.validation.Valid;

import org.perscholas.caseManager.models.Cases;
import org.perscholas.caseManager.models.Staff;
import org.perscholas.caseManager.services.CaseService;
import org.perscholas.caseManager.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	private CaseService caseService;
	
	@Autowired
	public HomeController(CaseService caseService) {
		this.caseService = caseService;
	}
	
//	private StaffService staffService;
//	
//	@Autowired
//	public HomeController(StaffService staffService) {
//		this.staffService = staffService;
//	}
	
//	@GetMapping("/")
//	public String showLoginPage() {
//		return "login";
//	}
//	
//	@GetMapping("/register")
//	public String showRegisterPage() {
//		return "register";
//	}
//	
//	@GetMapping("/home")
//	public String showHomePage() {
//		return "home";
//	}
	
//	@PostMapping("/createStaff")
//	public String createStaff(@Valid @ModelAttribute("staff") Staff staff) {
//		Staff savedStaff = staffService.createStaff(staff);
//		System.out.println(savedStaff.toString());
//		return "login";
//	}
	
//	@PostMapping("/search")
//	public String searchClientByClientNum(@RequestParam("clientNum") Integer clientNum, 
//			Model model) throws ClassNotFoundException {
//		Client client = clientService.findClientByClientNum(clientNum);
//		model.addAttribute("client", client);
//		return "index";
//	}

}