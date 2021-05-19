package springMVCDemo.dao;

import java.util.List;

import springMVCDemo.model.Employee;

public interface IEmployeeDao {
	int createEmployee(Employee e);
	List<Employee> readEmployees();
	int updateEmployee(Employee e,int eid);
	int deleteEmployee(int eid);
	Employee readEmployee(int eid);
}
