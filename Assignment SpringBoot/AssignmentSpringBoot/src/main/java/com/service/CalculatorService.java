package com.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	public String Addition(int a,int b) {
		int sum=a+b;
		return "Sum is "+sum;
	}
	

}
