package org.sarahEckenrode.caseManager.controllers;

import javax.validation.Valid;

import org.sarahEckenrode.caseManager.models.User;
import org.sarahEckenrode.caseManager.services.UserService;
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

@Controller
public class UserController {

	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/register_user")
	public String showRegisterPage(Model model) {
		model.addAttribute("newUser",new User());
		return "register_user";
	}
	
  	@PostMapping("/registerNewUser")
	public String registerNewUser(@Valid @ModelAttribute("newUser") User newUser, 
			BindingResult result) {
		if (result.hasErrors()) {
			return "register_user";
		}
		User user = userService.save(newUser);
		System.out.println(user.getUserId());
		return "redirect:/users";
	}
	
 	@RequestMapping("/users")
  	public String showUserPage(Model model) {
        model.addAttribute("users", userService.findAll());
  		return "users";
  	}
  	
    
    @RequestMapping(value = "/update-user/{userId}")
    public String showUpdateContactPage(@PathVariable Integer userId, Model model) {
        model.addAttribute("userId", userId);
        model.addAttribute("command", userService.findById(userId));
        return "update_user";
    }

    @RequestMapping(value = "/update-user/{userId}", method = RequestMethod.POST)
    public String updateUser(@PathVariable Integer userId, @ModelAttribute("user") User user) {
        userService.updateUser(userId, user);
        return "redirect:/users";
    }

    @RequestMapping(value = "/delete-user/{userId}")
    public String deleteUser(@PathVariable Integer userId) {
        userService.deleteByUserId(userId);
        return "redirect:/users";
    }
}
