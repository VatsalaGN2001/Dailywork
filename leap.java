package com.tapacademy.package1;

import java.util.Scanner;

public class leap {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n%4==0 && n%100!=0 || n%400==0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not a leap year");
		}
	}

}
