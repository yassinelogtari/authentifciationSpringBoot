package com.app.bank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.bank.entities.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Integer> {

	
}
