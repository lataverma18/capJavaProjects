package cap.onetomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setEname("Ronit");
		
		Employee e2=new Employee();
		e2.setEname("Rohit");
		
		Dept d=new Dept();
		d.setDname("Sales");
		d.setDmgr("Kamal");
		/*Set<Employee> s=new HashSet<>();
		s.add(e1);
		s.add(e2);
		d.setEmployees(s);*/
		d.addEmployees(e1);
		d.addEmployees(e2);		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(d);
		em.getTransaction().commit();
		emf.close();
	}
}
