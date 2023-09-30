package com.tapacademy.package1;

import java.util.Scanner;

public class prog15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
        int[] ar1=new int[n];
        for(int i=0;i<ar1.length;i++)
        {
           ar1[i]=scan.nextInt();
        }

        int m=scan.nextInt();
        int[] ar2=new int[m];
        for(int i=0;i<ar2.length;i++)
        {
           ar2[i]=scan.nextInt();
        }
        
        for(int i=0;i<ar1.length;i++) {
        	for(int j=0;j<ar2.length;j++)
        	{
        		if(ar1[i]%2 != 0 && ar2[j]%2 !=0)
        		{
        			System.out.print(ar1[i]);
        		}
        		else
        		{
        			System.out.print(false);
        		}
        	}
        }
        	

        

	}

}
