package javaday1;

public class Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// METHODS
		
		/* Access modifier static void method name () if there is nothing inside the round brackets we called it "method without arguments" 
		  and we have to call the other method int the main method without this we cannot execute this.*/
		
		monthly(1900000,9000,"january");
		monthly(200000,30000,"feb");
		int profitbeforetaxes=Monthly(100000,50000,"march");
		   System.out.println(profitbeforetaxes);
		
		
		 
		
		Addition();
}    
	
public static void Addition() {
		
		int income = 800000;
		int exp = 60000;
		int profit = income - exp;
		
		System.out.println(profit);
	}
	
// Methods with arguments

   public static void monthly(int inc,int expense, String month) {
	   int profit = inc-expense;
	   System.out.println("profit for"+month+"="+profit);
   }
   
 // Last method if we want to return something
   
   public static int Monthly (int incme,int expen,String month) {
	   int profit = incme-expen;
	  return  profit;
   }
}





