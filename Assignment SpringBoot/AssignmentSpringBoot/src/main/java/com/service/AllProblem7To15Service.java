package com.service;

import org.springframework.stereotype.Service;

@Service
public class AllProblem7To15Service {
	
	public String ReverseString(String s) {
		StringBuilder sc=new StringBuilder(s);
		return sc.reverse().toString();
	}
	
	public String PalindromeCheck(String w,String s) {
		if(w.equals(s)) return "Word "+w+" is palindrome";
		else return "not palindrome";
		
	}
	public String factorial(long n) {
		long fact=1;
		for (int i=1; i<n; i++) {
			fact=fact*i;
		}
		return "factorial is "+fact;
	}
	
	public String prime(int n) {
		if (n < 2) return n + " is not a prime number";
		for (int i=2;i*i<=n;i++) {
			if (n%i==0) return "not a prime number"; 
			
		
		}
		return n+" is prime number";
	}
	public String Discount(int p,int d) {
		int price=((p*d)/100);
		int afterDiscount=p-price;
		return "final price is "+afterDiscount +"\n \t price discount is"+price;
	}
	
	public String Simpleinterest(int p,int r,int t) {
		int interest=((p*r*t)/100);
		return "interest = "+interest;
		
	}
	
	public String maxNumber(int a,int b,int c) {
		if ((a>b)&&(a>c)) return "a is the max number";
		else if((b>a)&&(b>c) )return "b is the max";
		else return "c is larger";
	}
	
	
	
	
	
	
	

}
