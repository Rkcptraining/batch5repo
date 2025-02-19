package com.banking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.banking.entity.Employee;
import com.banking.service.BankingServiceInterface;

@RestController
public class BankingController {
	
	
	@Autowired
	private BankingServiceInterface bService;
	
	@GetMapping("allEmployee")
	public String displayAll() {
		return "i am get mapping";
	}
	
	
	@PostMapping("createProfile")
	public String createRecord(@RequestBody Employee emp) {
		return bService.createProfileService(emp);
	}
	
	//@PutMapping
	//@DeleteMapping
}
