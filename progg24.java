package com.tap.package1;

interface Calculator
{
	void add();
	void sub();
}

class MyCalculator implements Calculator
{
	public void add()
	{
		int c=10+20;
		System.out.println(c);
	}
	public void sub()
	{
		int c=20-10;
		System.out.println(c);
	}
	public void mul()
	{
		int c=10*20;
		System.out.println(c);
	}
}

public class progg24 {

	public static void main(String[] args) {
		MyCalculator mc=new MyCalculator();
		Calculator ref;
		ref=mc;
		ref.add();
		ref.sub();
		((MyCalculator)ref).mul();//using down casting we can achieve this hey ref in this line you act like a child type that's the meaning
		
	}

}
