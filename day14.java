package com.tap.package1;

class parent{
	void disp()
	{
		System.out.print("TAP");
	}
}

class child extends parent
{
	
}


public class day14 {
	public static void main(String[] args) {
		child  c=new child();
		c.disp();
		
		
	}

}
