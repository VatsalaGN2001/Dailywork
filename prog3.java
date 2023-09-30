package com.tapacademy.package1;

import java.util.Scanner;

public class prog3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[][][] a=new int[2][2][5];
		
	  for(int i=0;i<=1;i++)
	  {
		  for(int j=0;j<=1;j++)
		  {
			  for(int k=0;k<=4;k++)
			  {
				  System.out.print("enter the age");
				  a[i][j][k]=scan.nextInt();
			  }
		  }
	  }
	
	
	System.out.println("The ages are");

	

for(int i=0;i<=1;i++)
{
	  for(int j=0;j<=1;j++)
	  {
		  for(int k=0;k<=4;k++)
		  {
			  System.out.print(a[i][j][k]+ " ");
		  }
		  System.out.println();
	  }
}
}
}



			 
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  