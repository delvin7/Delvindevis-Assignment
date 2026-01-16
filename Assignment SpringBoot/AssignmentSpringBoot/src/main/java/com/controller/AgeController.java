package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.service.AgeCategoryService;

public class AgeController {
	
	@Autowired
	AgeCategoryService ac;
	
	@GetMapping("age/age{n}")
	public String age(@PathVariable int age) {
		return ac.ageCategory(age);
	}

}
