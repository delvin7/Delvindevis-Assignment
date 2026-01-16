package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.MessageService;

@RestController
public class MessageController {
	
	@Autowired
	MessageService ms;
	
	
	@GetMapping("/Message")
	public String getMessage() {
		return ms.message();
	}

}
