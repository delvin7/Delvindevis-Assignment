package com.service;

import org.springframework.stereotype.Service;

@Service
public class AgeCategoryService {
	
	public String ageCategory(int age) {
		if (age<18) return "child";
		else if(age<59) return "Adult";
		else return "Senior";
		
	}

}
