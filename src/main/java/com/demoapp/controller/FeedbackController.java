package com.demoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demoapp.model.Feedback;
import com.demoapp.service.FeedbackService;

@Controller
public class FeedbackController {

	@Autowired
	FeedbackService fdService = new FeedbackService();
	
	@GetMapping("/index")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("index");
		List<Feedback> list = (List<Feedback>) fdService.getList();
		mav.addObject("list", list);
		return mav;	
	}
	
	@GetMapping("/feedback")
	public String getFeedback() {
		return "feedback";
	}
	
	@PostMapping("/feedback")
	public String postFeedback(@RequestParam("feedback") String message) {
		fdService.addFeedback(message);
		return "redirect:/index";
	}
}
