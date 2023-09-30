package com.tapacademy.package1;

import java.util.Scanner;

public class prog13 
{
	

		public static void main(String[] args) {
		int height=0;
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<=n;i++)
			if(i%2==0)
		     {
			    height=height+1;
		     }
			else
			{
				height=height*2;
			}
		System.out.println(height);
}
}



		
    
    
  

