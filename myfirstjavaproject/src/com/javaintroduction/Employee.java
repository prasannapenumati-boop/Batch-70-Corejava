package com.javaintroduction;

public class Employee {
	
	static String orgName = "Vcube";
	static int orgId = 111;
	
	int id;
	String name;

	public static void main(String[] args) {
		System.out.println("Employee Info : ");
		System.out.println(orgName);
		System.out.println(orgId);

	    System.out.println("************");
		Employee e1 = new Employee();
		e1.id = 1;
		e1.name="Prasanna";
		System.out.println(orgName);
		System.out.println(orgId);
		System.out.println(e1.id);
		System.out.println(e1.name);
		
		System.out.println("************");
		Employee e2 = new Employee();
		e2.id = 2;
		e2.name="Pallavi";
		System.out.println(orgName);
		System.out.println(orgId);
		System.out.println(e2.id);
		System.out.println(e2.name);
		
		}
}
