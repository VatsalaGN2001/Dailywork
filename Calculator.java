package com.tapacademy.package1;

public class Calculator{
	
	double add()
	{
		int a=10;
		float b=5.7f;
	    double c=7.0;
		double d=a+b+c;
		return d;
		
	}

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		double res=calc.add();
		System.out.println(res);
				
		
	}

}
