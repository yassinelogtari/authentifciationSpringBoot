package com.app.bank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.bank.dto.EmployeeDto;
import com.app.bank.dto.LoginDto;
import com.app.bank.entities.Employe;
import com.app.bank.loginResponse.LoginResponse;

import java.util.Optional;
import com.app.bank.repositories.EmployeRepository;


@Service
public class EmployeServiceEmpl implements EmployeService{

	@Autowired
	private EmployeRepository employeRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public String addEmployee(EmployeeDto employeeDto) {
		
		Employe employe= new Employe(
				
				employeeDto.getId(),
				employeeDto.getName(),
				employeeDto.getEmail(),
				
				this.passwordEncoder.encode(employeeDto.getPassword())
				
				);
		
		employeRepository.save(employe);
		
		
		return employe.getName();
		
	}

	@Override
	public LoginResponse loginEmployee(LoginDto loginDto) {
	
        Employe employee1 = employeRepository.findByEmail(loginDto.getEmail());
        if (employee1 != null) {
            String password = loginDto.getPassword();
            String encodedPassword = employee1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<Employe> employee = employeRepository.findOneByEmailAndPassword(loginDto.getEmail(), encodedPassword);
                if (employee.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {
                return new LoginResponse("password Not Match", false);
            }
        }else {
            return new LoginResponse("Email not exits", false);
        }
    }
	
}
	
	
