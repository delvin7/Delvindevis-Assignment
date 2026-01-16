package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.service.EvenOdd;

@RestController
public class EvenOddController {
	@Autowired
	EvenOdd eo;
	@GetMapping("/evenodd/{n}")
	public String EvenOddCheck(@PathVariable int n) {
		return eo.CheckNum(n);
	}

}
