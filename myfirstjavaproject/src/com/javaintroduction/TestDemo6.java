package com.javaintroduction;

public class TestDemo6 {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called!!");
		
		
	}
	
	static TestDemo6 t = new TestDemo6();

	public static void main(String[] args) {
		TestDemo6 t6 = new TestDemo6();
		TestDemo6 t7 = new TestDemo6();
		 TestDemo6 t8 = new TestDemo6();
		
		// System.out.println(t6);//address @2b2fa4f7
	    // System.out.println(t7);//address @1dbd16a6
        // System.out.println(t8);//address @7ad041f3
        // System.out.println(t);//address  @251a69d7
     
		// 1) nullifing
        t6 = null;
        
        //2) reassigning the objects
        TestDemo6 t9 = new TestDemo6();
        System.out.println(t9);
        
        System.out.println(t6);//address null
	    System.out.println(t7);//address  @1dbd16a6
        System.out.println(t8);//address  @1dbd16a6
        System.out.println(t);//address  @251a69d7

        
        System.out.println(t6);
     System.gc();
     

	}

}
