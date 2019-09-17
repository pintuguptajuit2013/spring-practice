package com.tech.guru.pintu.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.tech.guru.pintu.ioc.model.Employee;

@SpringBootApplication
public class SpringIocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIocApplication.class, args);
		
		
		//		Object Constructed by Employee 
		Employee employee = new Employee();
		
		employee.setEid(1);
		employee.setEname("Pintu Gupta");
		employee.setEaddress("Sapoorji Complex");
		
		System.out.println(" Employee Details :" + employee);
		
		// Spring way | IOC (Inversion of control )
		
		Resource resource = new ClassPathResource("employeebean.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		Employee emp1 = (Employee) beanFactory.getBean("emp1");
		Employee emp2 = beanFactory.getBean("emp2", Employee.class);
		
		System.out.println("Bean Factory Employee1 Details :" + emp1);
		
		System.out.println(" Bean Factory Employee2 Details :" + emp2);
	
		// Application Context Container Without Requesting Container Create Object
		System.out.println("Application Context Example Started .....");
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		
		Employee emp11 = (Employee) context.getBean("emp1");
		Employee emp22 = context.getBean("emp2", Employee.class);
		
		System.out.println(" Application Context  Employee1 Details :" + emp11);
		
		System.out.println("Application Context   Employee2 Details :" + emp22);
		
		//Close the context 
		ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext)context;
		ctx.close();
		// Below Code give error as context has been closed 
		//System.out.println(" Application Context  Employee1 Details :" + (Employee) context.getBean("emp1"));
		
	}

}
