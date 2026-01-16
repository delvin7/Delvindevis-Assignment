package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.AllProblem7To15Service;

@RestController
@RequestMapping("/GET")
public class AllProblems7to15Controller {
	
	@Autowired
	AllProblem7To15Service service;
	
	
	@GetMapping("/reverse/{text}")
	public String reverse(@PathVariable String text) {
     return service.ReverseString(text);
	}
	@GetMapping("/palindrome/{word}")
	public String palindrome(@PathVariable ("word") String w){
      String s=service.ReverseString(w);
      return service.PalindromeCheck(w, s);
	}
	@GetMapping("/factorial/{num}")
	public String fact(@PathVariable long num){
      
      return service.factorial(num+1);
	}
	@GetMapping("/prime/{num}")
	public String prime(@PathVariable int num){
      
      return service.prime(num);
	}
	@GetMapping("/discount")
	public String discount(@RequestParam int price,@RequestParam int discount ){
      
      return service.Discount(price, discount);
	}
	@GetMapping("/interest")
	public String interest(@RequestParam int p,@RequestParam int r ,@RequestParam int t){
      
      return service.Simpleinterest(p, r, t);
	}
	@GetMapping("/max")
	public String max(@RequestParam int a,@RequestParam int b,@RequestParam int c){
      
      return service.maxNumber(c, b, c);
	}

}
