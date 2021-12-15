package javaday1;

public class Objectarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// If we want to work with multiple data type first to create the class with object and then we will create the object.
		
		Object a[]=new Object[5];
		a[0]=10;  //integer
        a[1]=20.5; // double 
        a[2]="to"; // char
	    a[4]="welcome"; // string
	    a[5]=true; //boolean
	    
	    
		for(Object i:a);
		{
			
			System.out.println(a);
		}
	}
}
	
	


