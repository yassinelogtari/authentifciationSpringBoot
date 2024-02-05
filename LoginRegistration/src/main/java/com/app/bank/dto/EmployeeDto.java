package com.app.bank.dto;
import lombok.*;

import com.app.bank.entities.Employe;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
	
	private int id;
	private String name;
	private String email;
	private String password;

}
