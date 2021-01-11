package com.demoapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoapp.dao.FeedbackDao;
import com.demoapp.model.Feedback;

@Service
public class FeedbackService {
	
	@Autowired
	private FeedbackDao feedbackDao;
	
	public void addFeedback(String message) {
		Feedback feedback = new Feedback(message);
		feedbackDao.save(feedback);
	}
	
	public List<Feedback> getList() {
		return (List<Feedback>) feedbackDao.findAll();
	}
}
