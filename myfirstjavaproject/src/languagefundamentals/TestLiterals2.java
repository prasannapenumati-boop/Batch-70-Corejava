package languagefundamentals;

public class TestLiterals2 {
	

	public static void main(String[] args) {
		System.out.println("main method started"); 
		
	float f1=100;
	float f2=0123;
	float f3=123F;
	float f4=0x123F;
	float f5=1230.5F;
	System.out.println(f1);
	System.out.println(f2);
	System.out.println(f3);
	System.out.println(f4);
	System.out.println(f5);
	
	char c1='A' ;
	char c2=65 ;
	char c3='\u0040';
	char c4=126;
	char c5=1234;
	char c6=12;
	char c7=34;
	char c8='\u0120';
	double d1=100;
	System.out.println(d1);
	
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
	System.out.println(c5);
	System.out.println(c6);
	System.out.println(c7);
	System.out.println(c8);
	
	String s1="Kachu";
	String s2="Kachu";
	String s3=new String("Kachu");
	String s4="prasanna";
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	
	boolean boo=true;
	boolean boo1=false;
	if(boo) {
		System.out.println("have a good day");
	}
	if(boo1) {
		System.out.println("how are you");
		
	}
	
	//int a=null;
	String s =null;
	Integer i1=null;
	TestLiterals2  t1=null;
 
	
	
	
	
	
	

	
		
		

    }

}
