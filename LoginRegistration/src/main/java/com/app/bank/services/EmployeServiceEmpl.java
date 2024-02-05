package com.app.bank.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.bank.dto.EmployeeDto;
import com.app.bank.repositories.EmployeRepository;


public class EmployeServiceEmpl implements EmployeService{

	@Autowired
	EmployeRepository employeRepository;
	
	@Override
	public String addEmployee(EmployeeDto emplDto) {
		
		return null;
	}
	
	

}
