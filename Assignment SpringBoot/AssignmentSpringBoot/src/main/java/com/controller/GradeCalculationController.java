package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.service.GradeCalculationService;

@RestController
public class GradeCalculationController {
	@Autowired
	GradeCalculationService gc;
	
	@GetMapping("/grade/{marks}")
	public String gradeCalculate(@PathVariable int n) {
		return gc.Grade(n);
	}

}
