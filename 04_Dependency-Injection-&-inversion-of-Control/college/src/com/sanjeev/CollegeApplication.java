package com.sanjeev;

public class CollegeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating Object of Address Class
		Address address1 = new Address();
		address1.setLocation("Varansi");
		address1.setPincode(221005);
		
		
		// Student Object
		Student s1 = new Student();
		s1.setName("Sanjeev");
		s1.setMobileNumber(8887370476l);
		
		// Student is Having Dependency of Address Object
		s1.setAddress(address1); // Injecting Address Object into Student Object
		
		System.out.println(s1.getName());
		System.out.println(s1.getMobileNumber());
		Address addr = s1.getAddress();
		System.out.println(addr.getLocation());
		System.out.println(addr.getPincode());

	}

}
