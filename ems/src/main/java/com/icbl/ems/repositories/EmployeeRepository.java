package com.icbl.ems.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icbl.ems.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, UUID> {
	
	//Select *from employee where firstName = 'John';
	
	List<Employee> findByFirstName(String firstName);
	
	//Select *from employee where firstName = 'John' and lastName = 'Mathew';
	List<Employee> findByFirstNameAndLastName(String firstName, String lastName);

}
