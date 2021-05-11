package cap.jpas.service;

import java.util.List;

import cap.jpas.dao.EmployeeDao;
import cap.jpas.dao.EmployeeDaoImpl;
import cap.jpas.entities.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao empDao;
	public EmployeeServiceImpl()
	{
		empDao=new EmployeeDaoImpl();
	}
	
	public void add(Employee e) {
		empDao.insert(e);
	}

	public Employee readEmp(int id) {
		return empDao.read(id);
	}

	public void updateEmp(Employee e) {
		empDao.update(e);	
	}

	public void deleteEmp(Employee e) {
		empDao.delete(e);
	}

	@Override
	public long getTotal() {
		
		return empDao.total_Emp();
	}

	@Override
	public List<Employee> getTotalEmp() {
		return empDao.getAllEmp();
	}

	@Override
	public List<Employee> getEmpInSalRange(int sSal, int eSal) {
		return empDao.getEmpInSalRange(sSal,eSal);
	}
}
