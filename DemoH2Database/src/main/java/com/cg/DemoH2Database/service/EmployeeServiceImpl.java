package com.cg.DemoH2Database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.DemoH2Database.dao.EmployeeRepository;
import com.cg.DemoH2Database.dto.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
	EmployeeRepository employeerepository;
	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return employeerepository.save(emp);
	}

	@Override
	public List<Employee> showEmployee() {
		// TODO Auto-generated method stub
		return employeerepository.findAll();
	}

}
