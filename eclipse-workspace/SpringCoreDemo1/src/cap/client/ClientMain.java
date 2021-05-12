package cap.client;

import java.io.File;
import java.util.Locale;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import cap.beans.CollectionBean;
import cap.beans.Employee;
import cap.beans.Greet;

public class ClientMain {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		AbstractApplicationContext bf=new ClassPathXmlApplicationContext("springcore.xml");
	
		//BeanFactory bf=new XmlBeanFactory(new ClassPathResource("springcore.xml"));
			/*Greet g=(Greet)bf.getBean("g1");
			g.welcomeMessage();
			Greet gg=(Greet)bf.getBean(Greet.class);
			g.welcomeMessage();*/
			
			Employee e=(Employee)bf.getBean("emp");
			System.out.println(e.getEid()+"\t"+e.getEname()+"\t"+e.getEsalary()+"\t"+e.getAddress1());
			
			Employee e1=(Employee)bf.getBean("emp");
			System.out.println(e1.getEid()+"\t"+e1.getEname()+"\t"+e1.getEsalary()+"\t"+e1.getAddress1());
			
			CollectionBean cb1=(CollectionBean)bf.getBean("cb");
			System.out.println(cb1.getLists());
			System.out.println(cb1.getSets());
			System.out.println(cb1.getMaps());
			System.out.println(cb1.getProperties());
		
			bf.registerShutdownHook();
	}
}
