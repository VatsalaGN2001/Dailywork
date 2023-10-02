package com.tap.package1;

import java.util.Scanner;

public class day31 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int T=scan.nextInt();
		for(int j=0;j<T;j++)
		{
	        int N=scan.nextInt();
	        scan.nextLine();
	        String S=scan.nextLine();
		 for(int i=0;i<N;i=i+2)
		 {
		     if(S.charAt(i)=='0' && S.charAt(i+1)=='0')
		     {
		         System.out.println("A");
		     }
		     else if(S.charAt(i)=='0' && S.charAt(i+1)=='1')
		     {
		         System.out.println("T");
		     }
		     else if(S.charAt(i)=='1' && S.charAt(i+1)=='0')
		     {
		         System.out.println("C");
		     }
		    else if(S.charAt(i)=='1' && S.charAt(i+1)=='1')
		     {
		         System.out.println("G");
		     }

}
	}
}
}

