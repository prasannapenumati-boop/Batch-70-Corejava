package com.javaintroduction;

public class TestDemo2 {
	 static TestDemo2 t2 = new TestDemo2();

	 public static void show() {
		 System.out.println("show method called ");
		 System.out.println("show method called ");
		 System.out.println("show method called ");
	 }
	 
	 
	 public static void main(String arg[]) {
		
		System.out.println("main method started ") ;
		
		
		TestDemo2 t = new TestDemo2();
		
		
		
		// calling the instance method
		t.hello();
		
		// calling the static method
				show();
				System.out.println("main method ended");
				
		}
	
	public void hello() {
		System.out.println("hello method called");
		System.out.println("hello method called");
		System.out.println("hello method called");
		
		
	}
	
}
	
	
	


