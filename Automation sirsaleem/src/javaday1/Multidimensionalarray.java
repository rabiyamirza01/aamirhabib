package javaday1;

public class Multidimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= new int[2][2];
		
		a[0][0]=10;
		a[0][1]=20;
		
		a[1][0]=30;
		a[1][1]=40;
		
		for(int i=0;i<1;i++) {
			for(int j=0;j<1;j++) {
				
				System.out.println(a[i][j]);
				
			}
		}
		
		}
}
