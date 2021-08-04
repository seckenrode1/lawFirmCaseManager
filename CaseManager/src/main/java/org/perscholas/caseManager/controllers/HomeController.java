package org.perscholas.caseManager.controllers;

import org.perscholas.caseManager.models.Case;
import org.perscholas.caseManager.services.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	private CaseService caseService;
	
	@Autowired
	public HomeController(CaseService caseService) {
		this.caseService = caseService;
	}
//	
//	@GetMapping("/")
//	public String showLoginPage() {
//		return "login";
//	}
//	
//	@GetMapping("/home")
//	public String showHomePage() {
//		return "home";
//	}
//	
//	@GetMapping("/index")
//	public String showIndexPage() {
//		return "index";
//	}
	
//	@PostMapping("/search")
//	public String searchClientByClientNum(@RequestParam("clientNum") Integer clientNum, 
//			Model model) throws ClassNotFoundException {
//		Client client = clientService.findClientByClientNum(clientNum);
//		model.addAttribute("client", client);
//		return "index";
//	}

}