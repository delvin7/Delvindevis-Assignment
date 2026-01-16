package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.CalculatorService;

@RestController
public class CalculatorController {
	@Autowired
	CalculatorService cs;
	
	@GetMapping("/add")
	public String Calculate(@RequestParam("a") int a,@RequestParam("b")int b) {
		return cs.Addition(a, b);
	}

}
