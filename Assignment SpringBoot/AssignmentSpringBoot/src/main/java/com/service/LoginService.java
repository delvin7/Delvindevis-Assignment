package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bean.Login;
@Service
public class LoginService {
	List<Login> info=new ArrayList<>();
	public String AddLogin(Login login) {
		String user=login.getUsername();
		
		for (Login l:info) {
			if (user.equals(l.getUsername())) {
				return "Failed.....username"+user+" already present";
			}
		}
		
	
		info.add(login);
		return "Success";
	}

}
