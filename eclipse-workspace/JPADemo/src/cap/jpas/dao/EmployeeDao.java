package cap.jpas.dao;

import java.util.List;

import cap.jpas.entities.Employee;

public interface EmployeeDao {
	void insert(Employee emp);
	Employee read(int id);
	void update(Employee emp);
	void delete(Employee emp);
	long total_Emp();
	List<Employee> getAllEmp();
	List<Employee> getEmpInSalRange(int sSal,int eSal);
}
