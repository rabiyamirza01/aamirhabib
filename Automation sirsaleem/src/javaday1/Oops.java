package javaday1;

public class Oops {
	
	public void run()
	{
		System.out.println("i am running");
	}
	
	public static void main (String args[])
	{
	  System.out.println(1);// It will print 1 because java always takes the main method
	  Oops buzo=new Oops();
	  buzo.run();
	}
	
	
}
