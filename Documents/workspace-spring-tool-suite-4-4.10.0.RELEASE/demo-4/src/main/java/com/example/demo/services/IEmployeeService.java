package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Employee;


public interface IEmployeeService {
	int createEmployee(Employee e);
	List<Employee> readEmployees();
	int updateEmployee(Employee e,int eid);
	int deleteEmployee(int eid);
	Employee readEmployee(int eid);
}
