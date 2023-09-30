package com.tap.package1;

import java.util.Scanner;

class Underage extends Exception
{
	
}
class Overage extends Exception
{
	
}

class Driving
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
		if(age>=18 && age<=65)
		{
			System.out.println("go and collect your driving license");
		}
		else if(age<18)
		{
			Underage u=new Underage();
			System.out.println("you are too young");
			throw u;
		}
		else
		{
			Overage o=new Overage();
			System.out.println("you are too old");
			throw o;
		}
	}
}

class Government1
{
	void init()
	{
		Driving d=new Driving();
		try
		{
			d.acceptInput();
			d.validate();
		}
		catch(Exception a)
		{
			try
			{
				d.acceptInput();
				d.validate();
			}
			catch(Exception b)
			{
				try 
				{
					d.acceptInput();
					d.validate();
				}
				catch(Exception c)
				{
					System.out.println("get lost");
				}
			}
		}
	}
}


public class day57 {

	public static void main(String[] args) {
		Government1 g=new Government1();
		g.init();
	}

}
