package com.javaintroduction;

public class TestDemo3 {
	

	static void method3() {
		  System.out.println("method3 called");
	}
	
	static void method4() {
		  System.out.println("method4 called");
		  method5();
	}
	
	static void method5() {
		  System.out.println("method5 called");
	}
		 
	
	static void method1() {
	  System.out.println("method1 called");
	  TestDemo3 t = new TestDemo3();
	  t.method2();
	}
	
	void method2() {
		System.out.println("method2 called");
		method3();
	     method4();
	}
	


	public static void main(String[] args) {
		System.out.println("main method started!!");
		method1();
		

	}

}
