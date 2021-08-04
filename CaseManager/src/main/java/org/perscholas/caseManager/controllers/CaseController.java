package org.perscholas.caseManager.controllers;

import javax.validation.Valid;

import org.perscholas.caseManager.models.Case;
import org.perscholas.caseManager.services.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
public class CaseController {
	
	private CaseService caseService;
	
	@Autowired
	public CaseController(CaseService caseService) {
		this.caseService = caseService;
	}

  	@GetMapping("/")
	public String showIndexPage(Model model) {
		model.addAttribute("case", new Case());
		return "index";
  	}
	
//	@PostMapping("/createCase")
//	public String createCase(@Valid @ModelAttribute("case") Case case1,
//			BindingResult errors) {
//		
//		if(errors.hasErrors())
//		{
//			return "index";
//		}
//		Case savedCase = caseService.createCase(case1);
//		return "redirect:/";
//	}
}
