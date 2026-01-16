package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Login;
import com.service.LoginService;
import com.service.WordCountService;

@RestController
@RequestMapping("/POST")
public class LoginController {
	@Autowired
	LoginService ls;
	
	@Autowired
	WordCountService wc;
	
	@PostMapping("/login")
	public String loginAdd(@RequestBody Login login) {
		return ls.AddLogin(login);
	}
	
	@PostMapping(value = "/wordcount", consumes = MediaType.TEXT_PLAIN_VALUE)
	public String loginAdd(@RequestBody String wcc) {
		return wc.wordcount(wcc);
	}
	
	
	

}
