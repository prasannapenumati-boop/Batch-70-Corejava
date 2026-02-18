package languagefundamentals;

import java.math.BigInteger;
import java.math.BigDecimal;


public class add1{
	
		BigInteger bi1 = new BigInteger("2637894629905198701");
        BigInteger bi2 = new BigInteger("2637894629905198701");
        
		BigDecimal bd1 = new BigDecimal(10);
		
		BigDecimal di1 = new BigDecimal("2637894629.888905198701");
        BigDecimal di2 = new BigDecimal("2637894629.888905198701");
        
       
       public static void main(String[] args) {
		
		add1 t3 = new add1() ;
		
		System.out.println("main method started ");  
		System.out.println(t3.bi1);
		System.out.println(t3.bi2);
		System.out.println(t3.bi1.multiply(t3.bi2));
		System.out.print("**********");
		System.out.println(t3.bi1.add(t3.bi2));
		System.out.print("**********");
		System.out.println(t3.bi1.mod(t3.bi2));
		
		
		
		
		 
		
		
	}

}
