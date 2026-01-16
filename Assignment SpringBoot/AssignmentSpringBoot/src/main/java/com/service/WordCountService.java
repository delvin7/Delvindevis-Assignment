package com.service;

import org.springframework.stereotype.Service;



@Service
public class WordCountService {
	public String wordcount(String w) {
		String[] k=w.trim().split("\\s+");
		int n=k.length;
		
		if (w == null || w.trim().isEmpty()) {
            n = 0;
        }
		return "word count "+n;
	}

}
