package com.tap.package1;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String s=scan.nextLine();
	char ch=scan.nextLine().charAt(0);
	String res="";
	for(int i=0;i<s.length();i++)
	{
		if(ch!=' ')
		{
			int si=i;
			break;
		}
	}
	
	for(int i=s.length()-1;i>0;i--)
	{
		if(ch!=' ')
		{
			int ei=i;
			break;
		}
	}
	

		
	
	}

}
