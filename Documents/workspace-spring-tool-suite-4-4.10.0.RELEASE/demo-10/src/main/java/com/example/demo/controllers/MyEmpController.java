package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
@Api(value="This is my REST controller for resource EMP")
@RestController
@RequestMapping("/myapp")
public class MyEmpController {
		
		List<Employee> lemps=new ArrayList<Employee>();
		@ApiOperation(value="This resource will provide all Employees")
		@GetMapping(value="/employees",produces="application/json")
		public List<Employee> getEmps()
		{
			return lemps;
		}
		
		@ApiOperation(value="This resource will provide Employee based on Id")
		@GetMapping("/employees/{id}")
		public Employee getEmp(@ApiParam(value="Parameter to fetch Id") @PathVariable("id") int id)
		{
			for(Employee emp:lemps)
			{
				if(emp.getEid()==id)
					return emp;
			}
				return null;
		}
		
		
		@PostMapping("/employees")
		public ResponseEntity<String> postEmp(@RequestBody Employee e)
		{
			lemps.add(e);
			return new ResponseEntity<>("Added !!!",HttpStatus.CREATED);
		}
		
		@DeleteMapping("/employees/{id}")
		public ResponseEntity<String> deleteEmp(@PathVariable("id") int id)
		{
			for(Employee emp:lemps)
			{
				if(emp.getEid()==id)
					{
					lemps.remove(emp);
					}
			}
			return new ResponseEntity<>("Deleted !!!",HttpStatus.OK);
		}	
	}
