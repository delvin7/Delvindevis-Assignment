package com.service;

import org.springframework.stereotype.Service;

@Service
public class TemperstureService {
	public String Calculate(int c) {
		
		int n=((c*(9/5))+32);
		return "temperature = "+n;
	}

}
