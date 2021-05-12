package cap.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Employee //implements InitializingBean,DisposableBean,BeanNameAware,BeanFactoryAware, ApplicationContextAware
{
	private int eid;
	private String ename;
	private int esalary;
	private Address address1;
	
	Employee(){}
	
	
	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public int getEsalary() {
		return esalary;
	}


	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}


	public Address getAddress1() {
		return address1;
	}


	public void setAddress1(Address address1) {
		this.address1 = address1;
	}


	public void start()
	{
		System.out.println("My custom init-Method");
	}
	
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
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", address=" + address1 + "]";
	}
	
}
