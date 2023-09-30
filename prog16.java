package com.tapacademy.package1;
import java.util.Scanner;

public class prog16 {

	static boolean isPrime(int n) {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
           
        }
        return true;
        
    }
	
	static void printPrimes(int n)
	{
		 for(int i= 2;i<=n;i++)
	        {
	            if(isPrime(i))
	            {
	                System.out.print(i + " ");
	            }
	        }
	}


    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        printPrimes(n);
     }
    
}








