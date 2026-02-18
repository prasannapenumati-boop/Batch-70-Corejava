package LearningJava;

public class Cricketer {
	

	static int countryId;
	static String countryName;
	
	int jerseyNo;
	String cricketerName;
	
	
     public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Welcome to Indian Cricket team!!");
		
        countryId= 91;
        countryName= "India";
		System.out.println("CountryId : "+countryId);//0
		System.out.println("countryName :" +countryName);//null
		
		System.out.println("*******object1 info******");
		Cricketer msd=new Cricketer();
		msd.jerseyNo=7;
		msd.cricketerName="Mahendra Singh Dhoni";
		System.out.println("CountryId : "+countryId);//0
		System.out.println("countryName :" +countryName);//null
		System.out.println( "Jersey Number : "+ msd.jerseyNo);//0
		System.out.println("CricketerName : "+msd.cricketerName );//null
		
		System.out.println("*******object2 info******");
		Cricketer king =new Cricketer();
		king.jerseyNo=18;
		king.cricketerName="King Kohli";
		System.out.println("CountryId : "+countryId);//0
		System.out.println("countryName :" +countryName);//null
		System.out.println( "Jersey Number : "+ king.jerseyNo);//0
		System.out.println("CricketerName : "+ king.cricketerName );//null
		
		System.out.println("main method ended !");//null
		
	}
	
}
	
		
	
	
		

	


