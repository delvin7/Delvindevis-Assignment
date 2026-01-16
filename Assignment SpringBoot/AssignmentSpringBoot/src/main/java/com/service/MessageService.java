package com.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
	public String message() {
		return  "Welcome to Spring Boot REST API";
	}

}
