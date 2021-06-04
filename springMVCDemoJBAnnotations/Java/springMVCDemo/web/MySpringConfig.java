package springMVCDemo.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import springMVCDemo.model.Employee;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages= {"springMVCDemo.controllers","springMVCDemo.services","springMVCDemo.dao"})
public class MySpringConfig {
	@Bean
    public ViewResolver viewResolver() 
	{   	
    	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/jsps/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}

