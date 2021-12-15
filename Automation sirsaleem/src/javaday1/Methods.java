package javaday1;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Addition();
          Monthly(500000,60000,"january");
          Monthly(200000,40000,"february");
	}
	
	public static void Addition() {  // Methods without arguments
		
		int inc=500000;
		int exp=90000;
		int profit= inc-exp;
		
		System.out.println(profit);  /*If we will execute this it will not run anything because it s not in the main method so we have to cal "ADDITION" in the 
		                                 main method. When we create the method outside of the main method  we have to call that method inside the main method*/
	}
	
	public static void Monthly(int income,int expense,String month) { // Methods with Arguments
		int Profiit = income-expense;
		
		System.out.println("This is the profit"+month+"="+Profiit);
		
	}

}
