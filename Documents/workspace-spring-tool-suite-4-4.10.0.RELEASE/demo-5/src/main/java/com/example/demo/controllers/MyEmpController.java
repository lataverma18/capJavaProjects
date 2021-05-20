package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.services.EmployeeServiceImpl;


@RestController
public class MyEmpController {
		@Autowired
		EmployeeServiceImpl eserv;
		@GetMapping(value="/employees",produces="application/json")
		public List<Employee> getEmps()
		{
			return eserv.readEmployees();
		}
		

		@GetMapping("/employees/{id}")
		public Employee getEmp(@PathVariable("id") int id)
		{
			return eserv.readEmployee(id);
		}
		
		@PutMapping("/employees")
		public ResponseEntity<String> updateEmp(@RequestBody Employee e)
		{
			eserv.updateEmployee(e, e.getEid());
			return new ResponseEntity<>("Updated !!!",HttpStatus.ACCEPTED);
		}
		
		@PostMapping("/employees")
		public ResponseEntity<String> postEmp(@RequestBody Employee e)
		{
			eserv.createEmployee(e);
			return new ResponseEntity<>("Added !!!",HttpStatus.CREATED);
		}
		
		@DeleteMapping("/employees/{id}")
		public ResponseEntity<String> deleteEmp(@PathVariable("id") int id)
		{
			eserv.deleteEmployee(id);
			return new ResponseEntity<>("Deleted !!!",HttpStatus.OK);
		}
		
		
	}
