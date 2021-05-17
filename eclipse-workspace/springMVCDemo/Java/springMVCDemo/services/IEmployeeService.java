package springMVCDemo.services;

import java.util.List;

import springMVCDemo.model.Employee;

public interface IEmployeeService {
	int createEmployee(Employee e);
	List<Employee> readEmployees();
	int updateEmployee(Employee e,int eid);
	int deleteEmployee(int eid);
}
