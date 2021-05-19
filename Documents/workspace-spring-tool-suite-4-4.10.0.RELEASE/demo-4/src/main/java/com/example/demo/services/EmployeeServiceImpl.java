package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.EmployeeDaoImpl;
import com.example.demo.model.Employee;


@Service("eserv")
public class EmployeeServiceImpl  implements IEmployeeService{
	@Autowired
	EmployeeDaoImpl edao;
	
	public int createEmployee(Employee e) {
		
		return edao.createEmployee(e);
	}

	public List<Employee> readEmployees() {
		
		return edao.readEmployees();
	}

	public int updateEmployee(Employee e, int eid) {
		
		return edao.updateEmployee(e, eid);
	}

	public int deleteEmployee(int eid) {
		
		return edao.deleteEmployee(eid);
	}

	public Employee readEmployee(int eid) {
		
		return edao.readEmployee(eid);
	}

}
