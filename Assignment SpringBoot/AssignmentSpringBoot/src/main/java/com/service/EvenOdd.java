package com.service;

import org.springframework.stereotype.Service;

@Service
public class EvenOdd {
	public String CheckNum(int n) {
		if (n%2==0)
			return n+" is Even Number";
		else
			return n+" is odd number";
	}

}
