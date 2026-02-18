package com.javaintroduction;

public class Student {
	
	int sid;
	String sname;
	
	static int collegeId;
	static String collegeName;
    
	public static void main(String[] args) {
		System.out.println("main method started!!");
		System.out.println("Vcube related Information");
		
		
		collegeId = 612;
		collegeName = "Kits";
		System.out.println("college Id");
		System.out.println("college Name");
		
		
		System.out.println("****object1 info*****");
		Student s1 = new Student();
		s1.sid = 18;
		s1.sname = "Virat Kohli";
	    System.out.println("Student ID : " + s1.sid);
		System.out.println("Student Name : " +s1.sname);
		
		
		System.out.println("****object2 info*****");
		Student s2 = new Student();
		s2.sid = 7;
		s2.sname = "Mahi Dhoni";
	    System.out.println("Student ID : " + s2.sid);
		System.out.println("Student Name : " +s2.sname);
	    System.out.println("college Id");//612
		System.out.println("college Name");//kits
		
		
		
				
		
		
		System.out.println("main method ended!!");
		
	}
	
}




