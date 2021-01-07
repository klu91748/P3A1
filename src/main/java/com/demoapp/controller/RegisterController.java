package com.demoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demoapp.service.UserService;

@Controller
public class RegisterController {

	@Autowired
	UserService userService;
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@PostMapping("/register")
	public String registerValid(@RequestParam("uname") String name, @RequestParam("pass") String pass) {
		userService.addUser(name, pass);
		return "redirect:/index";
	}
}
