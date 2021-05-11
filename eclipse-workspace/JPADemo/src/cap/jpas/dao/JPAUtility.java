package cap.jpas.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtility {
	private static EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
	static
	{
		try
		{
			/*System.out.println("Static Block");
			emf=Persistence.createEntityManagerFactory("JPA-PU");
			System.out.println("Created");*/
		}
		catch(Throwable e)
		{
			System.out.println(e);
		}
	}
	public static EntityManagerFactory getEMF()
	{
		return emf;
	}
	public static void closeEMF()
	{
		if(emf!=null && emf.isOpen())
			emf.close();
		
	}
}
