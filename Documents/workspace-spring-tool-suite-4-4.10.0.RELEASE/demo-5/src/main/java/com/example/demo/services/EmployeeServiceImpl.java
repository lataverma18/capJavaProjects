package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.IEmployeeDao;
import com.example.demo.model.Employee;


@Service("eserv")
public class EmployeeServiceImpl  implements IEmployeeService{
	@Autowired
	IEmployeeDao edao;
	
	public int createEmployee(Employee e) {
		Employee emp=edao.save(e);
		return emp.getEid();
	}

	public List<Employee> readEmployees() {
		
		return edao.findAll();
	}

	public int updateEmployee(Employee e, int eid) {
		
		return edao.save(e).getEid();
	}

	public int deleteEmployee(int eid) {
		edao.deleteById(eid);
		return eid;
	}

	public Employee readEmployee(int eid) {
		Integer id=eid;
		return edao.findById(id).get();
	}

}
