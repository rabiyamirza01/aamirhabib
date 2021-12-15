package javaday1;

public class Methods1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	// Lets change the scnerio we want to get the profit before tax 
	
	int profitbeforetax=monthly(500000,20000,"January");
	
	System.out.println(profitbeforetax);
	
	}
  
public static int monthly(int income, int expense, String month) { // "int" means in method is that we are returning something and what we are getting it's profit
	int profit = income-expense;
	return profit;
	
}

}
