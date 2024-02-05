package com.app.bank.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.app.bank.entities.Employe;


@EnableJpaRepositories
@Repository
public interface EmployeRepository extends JpaRepository<Employe, Integer> {

	  Optional<Employe> findOneByEmailAndPassword(String email, String password);
	    Employe findByEmail(String email);
	
}
