package com.cg.DemoH2Database.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.cg.DemoH2Database.dto.Employee;
import com.cg.DemoH2Database.service.EmployeeService;

@RestController
public class EmployeeController {
	Logger log=LoggerFactory.getLogger(EmployeeController.class);
	@Autowired
	EmployeeService employeeServiceimpl;
	
	@PostMapping(value="/addemp")
	public ResponseEntity<Employee> addData(@RequestBody Employee emp){
	
		Employee empData=employeeServiceimpl.addEmployee(emp);
	log.info("Adding Data in");
	if(HttpStatus.BAD_REQUEST == null) {
		log.warn("Bad Request...");
	}	return new ResponseEntity<Employee>(empData,HttpStatus.OK);
	
		
	}
	@GetMapping(value="/showemp")
	public ResponseEntity<List<Employee>> showData(){
		log.info("Showing Data in");
		if(HttpStatus.BAD_REQUEST == null) {
			log.warn("Bad Request...");
		}
	return new ResponseEntity<List<Employee>>(employeeServiceimpl.showEmployee(),HttpStatus.OK);
		
	}
}
