package cap.jpas.service;

import java.util.List;

import cap.jpas.entities.Employee;

public interface EmployeeService {
	void add(Employee e);
	Employee readEmp(int id);
	void updateEmp(Employee e);
	void deleteEmp(Employee e);
	long getTotal();
	List<Employee> getTotalEmp();
	List<Employee> getEmpInSalRange(int sSal,int eSal);
}
