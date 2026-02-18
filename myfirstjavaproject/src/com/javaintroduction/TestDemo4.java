package com.javaintroduction;

public class TestDemo4 {
	
	void main( ) {
		System.out.println("instance main method called");
	}

	public static void main(String[] args) {
		System.out.println("static main method called");
		TestDemo4 testDemo4 = new TestDemo4();
		testDemo4.main();
		
		
	}

}
