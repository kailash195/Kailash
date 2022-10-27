package com.springboot.springsecurity.springSecurityApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.springboot.springsecurity.springSecurityApplication.model.Home;
import com.springboot.springsecurity.springSecurityApplication.repository.HomeRepository;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	HomeRepository homeRep;
	
	@GetMapping("/gethome")
	public List<Home> getAllEmployees()
	{
		return homeRep.findAll();
	}
	
	@PostMapping("/gethome")
	public Home createEmployee(@Validated @RequestBody Home home) {
		return homeRep.save(home);
	}

}
