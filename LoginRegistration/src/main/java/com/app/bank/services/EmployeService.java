package com.app.bank.services;

import com.app.bank.dto.EmployeeDto;
import com.app.bank.dto.LoginDto;
import com.app.bank.loginResponse.LoginResponse;


public interface EmployeService {
	
	String 	addEmployee(EmployeeDto emplDto);
	
	LoginResponse loginEmployee(LoginDto loginDto);

}
