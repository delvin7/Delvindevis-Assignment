package com.service;

import org.springframework.stereotype.Service;

@Service
public class GradeCalculationService {
	
	public String Grade(int n) {
		if(n>=90) return "A";
		else if(n>=75) return "B";
		else if (n>=60) return "c";
		else return "Fail";
	}

}
