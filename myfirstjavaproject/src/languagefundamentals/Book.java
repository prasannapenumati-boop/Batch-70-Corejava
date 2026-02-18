package languagefundamentals;

public class Book {
  
	
	int Bookid;
	String title;
	String name;
	static int price; 
	static  double discountprice() {
		double dp = price+(price*0.1);
		return dp;
		
	}

	public static void main(String[] args) {
		
		 Book a1 = new Book() ;
		a1.Bookid=100;
		a1.title="art of being alone";
		a1.author=""
		
		
		
		
	}

}
