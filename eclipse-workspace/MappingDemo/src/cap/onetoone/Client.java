package cap.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();
		
		Employee emp=new Employee();
		emp.setEname("Ronit");
		emp.setEsalary(40000);
		
		
		Address add=new Address();
		add.setAddress("A-110/34");
		add.setCity("Delhi");
		add.setState("New Delhi");
		add.setZipcode(120187);
		
		emp.setAddress(add);
		//Save Parent Object
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		System.out.println("Added!!!");
	}
}
