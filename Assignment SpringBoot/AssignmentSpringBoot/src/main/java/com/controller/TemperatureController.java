package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.service.TemperstureService;

@RestController
public class TemperatureController {
	@Autowired
	TemperstureService ts;
	
	@GetMapping("/GET /celsius-to-fahrenheit/{celsius}")
	public String temp(@PathVariable int c) {
		return ts.Calculate(c);
	}

}
