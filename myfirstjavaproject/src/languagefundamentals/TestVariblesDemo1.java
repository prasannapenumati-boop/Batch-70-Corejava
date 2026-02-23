package languagefundamentals;

public class TestVariblesDemo1 {
	int id;
	String name;
	 
	static int employeeid = 55;
	static String employeename = "Vcube";
	
	
   public static void main(String[] args) {
	   String name = "Nick";
	   int a=55;
	   
	   int employeeid=11;
	   String employeename="John";
	   
	   
	   System.out.println(employeeid);
	   System.out.println(employeename);
	   
	   System.out.println("----------------------------");
	   
	   System.out.println("Main method started");
		System.out.println(name);
		System.out.println(a);
		System.out.println("**********************");
		
	//accessing static data directly	
	 System.out.println(employeeid);
	 System.out.println(employeename);
	 System.out.println("**********************");
	 
	//accessing static data using class name
	 System.out.println(TestVariblesDemo1.employeename);
	 System.out.println(TestVariblesDemo1.employeeid);
	 
	 TestVariblesDemo1 s3 = null;
	System.out.println("s3.name");//null
	System.out.println("s3.id");//0
	
	 	}

}
