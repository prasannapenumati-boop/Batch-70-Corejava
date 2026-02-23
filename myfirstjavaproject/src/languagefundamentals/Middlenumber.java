package languagefundamentals;

public class Middlenumber {

	public static void main(String[] args) {

		int num = 786;
		
//		num=786 
//				
//				100)786(7 -> /
//					700
//				-----------
//				     86   -> %  
		
//		  86 -> 
//		    
//		  10)86(8 -> /
//		     80
//		   -------
//		      6
		
		int digit = (num % 100) / 10;
		System.out.println("middle digit:" + digit);
		
	System.out.println("************************************");	
		int num1 = 533;
		int digit1 = (num1 % 100)/10;
		System.out.println("middle digit:" + digit1);
		
		
		

	}

}
