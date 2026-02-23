package LanguageFundamentalmethods;

public class TestMethodDemo1 {
	void addition() {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		
	}
    void substraction() {
    	int a = 100;
		int b = 200;
		System.out.println(a-b);
    }
    void multiplication() {
    	int a = 15;
		int b = 20;
		System.out.println(a*b);
    }
    void divison() {
    	int a = 50;
		int b = 2;
		System.out.println(a/b);
    }
    void modulus() {
    	int a = 100;
		int b = 5;
		System.out.println(a%b);
//		a=100
//		b=5
//		
//		a%b -> 100%5
//		
//		5)100(20 -> /
//		  10
//		 -----
//		   00
//		    0
//		   ----
//		    0     -> %
		
    }
	
	 void main(String[] args) {
		System.out.println("Mainmethod started");
		addition ();
		substraction();
		multiplication();
		divison();
		modulus();
	}

}
