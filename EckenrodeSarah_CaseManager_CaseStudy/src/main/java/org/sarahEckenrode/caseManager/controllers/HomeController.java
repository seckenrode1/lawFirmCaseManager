package org.sarahEckenrode.caseManager.controllers;

import javax.validation.Valid;

import java.util.Collection;

import org.sarahEckenrode.caseManager.models.Contact;
import org.sarahEckenrode.caseManager.models.User;
import org.sarahEckenrode.caseManager.services.ContactService;
import org.sarahEckenrode.caseManager.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {	
	
//	private UserService userService;
//	
//	@Autowired
//	public HomeController(UserService userService) {
//		this.userService = userService;
//
//	}

  	@GetMapping("/")
	public String showHomePage(Model model) {
		// Get current user
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		// Print current user granted authorities
		Collection<? extends GrantedAuthority> authorities = SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		System.out.println(authorities);
		
		model.addAttribute("currentUser", ((UserDetails)principal).getUsername());
		return "contacts";
  	}	
	
	@GetMapping("/login")
	public String showLoginPage() {
		return "login";
	}
	
	
	@GetMapping("/accessDenied")
	public String showAccessDeniedPage() {
		return "access_denied";
	}
	
	@GetMapping("/users")
	public String showAdminPage() {
		return "users";
	}
	
	@GetMapping("/logout-success")
	public String showLogoutPage() {
		return "login";
	}
	

  
}