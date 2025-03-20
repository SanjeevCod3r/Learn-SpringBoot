package com.sanjeev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CollegeApplication {

    public static void main(String[] args) {
    	
    	// Create Container Object and then you can pass XML file location to Container
    	
    	// File to Path Container
    	
        ApplicationContext container = new FileSystemXmlApplicationContext("C:\\Users\\SANJE\\eclipse-workspace\\spring-first-application\\spring.xml");

        // Pass the Bean Id
       Object obj =  container.getBean("address1");
       
       Address a1 = (Address)obj;
       
       a1.printMyAddress();
        
        // get Student Object
       Object obj2 = container.getBean("student1");
       Student s1 = (Student) obj2;
       
       System.out.print(s1.getMobileNumber()); 
    }
}
