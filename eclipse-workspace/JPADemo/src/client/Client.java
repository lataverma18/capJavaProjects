package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import cap.jpas.dao.JPAUtility;
import cap.jpas.entities.Employee;
import cap.jpas.service.EmployeeService;
import cap.jpas.service.EmployeeServiceImpl;

public class Client {
	public static void main(String []args)
	{
		EmployeeService es=new EmployeeServiceImpl();
		/*
		Employee emp=new Employee();
		emp.seteName("Rita");
		emp.seteSalary(56000);
		
		es.add(emp);
		*/
		
		System.out.println(es.getTotal());
		
		System.out.println(es.getTotalEmp());
		
		System.out.println(es.getEmpInSalRange(50000, 80000));
		
		/*Employee e=es.readEmp(102);
		System.out.println(e);
		es.deleteEmp(e);
		System.out.println("Deleted!!!");
	*/	JPAUtility.closeEMF();
		
		
	}
}
