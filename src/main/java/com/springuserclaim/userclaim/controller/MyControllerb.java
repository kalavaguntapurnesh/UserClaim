

package com.springuserclaim.userclaim.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springuserclaim.userclaim.entities.UserClaim_Detail;
import com.springuserclaim.userclaim.services.UserService;

@RestController

public class MyControllerb {
	
	
	@Autowired
	//used for the dependency injection
	private UserService user_service;
	
	
	
	@GetMapping("/home")
	public String home()
	{
		return "this is home page";
	}
	
	
	
	@GetMapping("/getdetails")
	public List<UserClaim_Detail> getDetails(){
		
		return this.user_service.getDetails();
		
	}
	
	
	
	
	

}
