package com.tap.package1;

import java.util.Scanner;

class InvalidInput extends Exception
{
	
}

class Election
{
	int age;
	void acceptInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the age");
		age=scan.nextInt();
	}
	
	void validate() throws Exception
	{
		if(age>=18)
		{
			System.out.println("good go and vote");
		}
		else
		{
			InvalidInput i=new InvalidInput();
			System.out.println("Re apply");
			throw i;
		}
	}
}

class Government
{
	void init()
	{
		Election e=new Election();
		try
		{
			e.acceptInput();
			e.validate();
		}
		catch(Exception a)
		{
			try
			{
				e.acceptInput();
				e.validate();
			}
			catch(Exception b)
			{
				try
				{
					e.acceptInput();
					e.validate();
				}
				catch(Exception c)
				{
					System.out.println("get lost");
				}
			}
		}
	}
}


public class day56 {

	public static void main(String[] args) {
		Government g=new Government();
		g.init();
	}

}
