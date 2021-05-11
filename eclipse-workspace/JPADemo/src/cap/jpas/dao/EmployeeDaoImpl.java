package cap.jpas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import cap.jpas.entities.Employee;


public class EmployeeDaoImpl implements EmployeeDao{
	EntityManager em;
	public EmployeeDaoImpl()
	{
		em=JPAUtility.getEMF().createEntityManager();
	}
	public void insert(Employee emp) {
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		System.out.println("Added Successfully!!!");
	}

	public Employee read(int id) {
		return em.find(Employee.class, id);
	}

	public void update(Employee emp) {
		Employee e=em.find(Employee.class, emp.geteId());
		if(e!=null)
		{
		em.getTransaction().begin();
		em.merge(emp);
		em.getTransaction().commit();
		System.out.println("Updated Successfully!!!");
		}
	}

	public void delete(Employee emp) {
		Employee e=em.find(Employee.class, emp.geteId());
		if(e!=null)
		{
		em.getTransaction().begin();
		em.remove(emp);
		em.getTransaction().commit();
		System.out.println("Deleted Successfully!!!");
		}
	}
	@Override
	public long total_Emp() {
		TypedQuery<Long> query=em.createQuery("select count(*) as Total_Emp from Employee",Long.class);
		return query.getSingleResult().longValue();
	}
	@Override
	public List<Employee> getAllEmp() {
		TypedQuery<Employee> query=em.createNamedQuery("getAllEmps",Employee.class);
				return  query.getResultList();
	}
	@Override
	public List<Employee> getEmpInSalRange(int sSal, int eSal) {
		TypedQuery<Employee> tq=em.createQuery("select employee from Employee employee where ESalary between :param1 and :param2",Employee.class);
		tq.setParameter("param1", sSal);
		tq.setParameter("param2", eSal);
		return tq.getResultList();
	}

}
