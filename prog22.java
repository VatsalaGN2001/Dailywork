package com.tapacademy.package1;

import java.util.Scanner;

public class prog22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		 int[] ar=new int[n];
		 for(int i=0;i<ar.length;i++)
		 {
			 ar[i]=scanner.nextInt();
		 }
		 for(int i=0;i<ar.length-1;i++)
		 {
			 if(ar[i+1]-ar[i]==1)
			 {
				 System.out.print(ar[i] + "$");
			 }
			 else if(ar[i]%2==0 && ar[i+1]%2==0)
			 {
				 System.out.print(ar[i] + "#" );
			 }
			 else
			 {
				 System.out.print(ar[i] + "*" );
			 }
	}
		 System.out.print(ar[ar.length-1]);
	}
}


