package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
@SpringBootApplication
public class DbMigrationApplication {
	
	@Autowired
	private EmployeeRepository repository;
	
	@PostMapping
	public Employee save(@RequestBody Employee emp) {
		return repository.save(emp);	
	}

	@GetMapping
	public List<Employee> getEmployees(){
		return repository.findAll();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DbMigrationApplication.class, args);
	}

}
