package com.tapacademy.package1;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int f=1;
		for(int i=n;i>0;i--)
		
		{
			f=f*i;
		}
			System.out.println(f);
		
	}

}
