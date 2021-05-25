package com.cg.DemoH2Database.service;

import java.util.List;

import com.cg.DemoH2Database.dto.Employee;

public interface EmployeeService {
public Employee addEmployee(Employee emp);
public List<Employee> showEmployee();
}
