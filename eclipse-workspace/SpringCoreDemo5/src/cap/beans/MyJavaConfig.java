package cap.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyJavaConfig {
	@Bean(name="address")
	@Scope(scopeName="prototype")
	public Address address()
	{
		return new Address();
	}
	@Bean(name="emp",initMethod="start", destroyMethod="myDestroy")
	public Employee employee()
	{
		return new Employee();
	}
}
