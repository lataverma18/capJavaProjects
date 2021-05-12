package cap.client;

import java.io.File;
import java.util.Locale;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import cap.beans.Address;
import cap.beans.CollectionBean;
import cap.beans.Employee;
import cap.beans.Greet;
import cap.beans.MyJavaConfig;

public class ClientMain {

	
	public static void main(String[] args) {
		AbstractApplicationContext bf=new AnnotationConfigApplicationContext(MyJavaConfig.class);
		
			Address a=(Address)bf.getBean("address");
			Employee e=(Employee)bf.getBean("emp");
			System.out.println(e);
			
			bf.registerShutdownHook();
			bf.close();
	}
}
