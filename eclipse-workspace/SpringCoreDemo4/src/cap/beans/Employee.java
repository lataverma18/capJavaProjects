package cap.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Employee  //employee //implements InitializingBean,DisposableBean,BeanNameAware,BeanFactoryAware, ApplicationContextAware
{
	private int eid;
	private String ename;
	private int esalary;
	private Address address;
	
	Employee(){}
	
	
	public int getEid() {
		return eid;
	}

	@Value("101")
	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}

	@Value("Ronit")
	public void setEname(String ename) {
		this.ename = ename;
	}


	public int getEsalary() {
		return esalary;
	}

	@Value("56000")
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}


	public Address getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@PostConstruct
	public void start()
	{
		System.out.println("My custom init-Method");
	}
	
	@PreDestroy
	public void myDestroy()
	{
		System.out.println("My custom Destroy Method");
	}
	/*@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean Method: After Properties Set");	
	}
	@Override
	public void destroy() throws Exception {
	System.out.println("DisposableBean Method: destroy");
		
	}
	@Override
	public void setBeanName(String arg0) {
		System.out.println("Bean Name is: "+arg0);
		
	}
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("Bean Factory is:"+arg0);
		
	}
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("ApplicationContext is:"+arg0);	
	}*/
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", address=" + address + "]";
	}
	
}
