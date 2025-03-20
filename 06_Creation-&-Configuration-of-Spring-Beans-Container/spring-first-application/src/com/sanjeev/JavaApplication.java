package com.sanjeev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class JavaApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Container Object
		 ApplicationContext container = new FileSystemXmlApplicationContext("C:\\Users\\SANJE\\eclipse-workspace\\spring-first-application\\spring.xml");
		 
		 // Address Object
		Object obj1 =  container.getBean("address2");
		Address a2 = (Address)obj1;
		
		System.out.println(a2);
		
		Object obj2 =  container.getBean("address1");
		Address a3 = (Address)obj2;
		
		System.out.print(a3);
		 

	}

}
