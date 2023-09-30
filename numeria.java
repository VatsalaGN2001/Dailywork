package com.tapacademy.package1;

import java.util.Scanner;

public class numeria {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(b%a==0)
		{
			int c=b/a;
			System.out.println(c);
		}
			else
			{
				int c=b*a;
				System.out.println(c);
			}
		}
	}


