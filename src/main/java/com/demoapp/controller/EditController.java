package com.demoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.demoapp.service.UserService;

@Controller
@SessionAttributes({"name", "password"})
public class EditController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/edit")
	public String getedit() {
		return "edit";
	}
	
	@PostMapping("/edit")
	public String postedit(ModelMap model, @RequestParam String pass) {
		userService.updateUser((String) model.get("name"), pass);
		return "redirect:/success";
	}
	
	@GetMapping("/success")
	public String getsuccess() {
		return "success";
	}	
}
 