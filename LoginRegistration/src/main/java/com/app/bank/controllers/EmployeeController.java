package com.app.bank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.bank.dto.EmployeeDto;
import com.app.bank.dto.LoginDto;
import com.app.bank.loginResponse.LoginResponse;
import com.app.bank.services.EmployeService;

@RestController
@CrossOrigin
@RequestMapping("api/employee")
public class EmployeeController {

	@Autowired
	private EmployeService employeService;
	
	
	@PostMapping("/register")
	public String saveEmploye(@RequestBody EmployeeDto employeeDto) {
		
		String name= employeService.addEmployee(employeeDto);
		
		return name;
	}
	
	
	@PostMapping("/login")
	public ResponseEntity<?> loginEmploye(@RequestBody LoginDto loginDto) {
		
		LoginResponse loginMessage=employeService.loginEmployee(loginDto);
		return ResponseEntity.ok(loginMessage);
	}
}
