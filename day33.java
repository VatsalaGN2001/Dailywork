package com.tapacademy.package1;

import java.util.Scanner;

public class day33 {

	public static void main(String[] args) {
		
				Scanner scan=new Scanner(System.in);
				    int T=scan.nextInt();
				    while(T>0)
				    {
				         int a=0;
				         int flag=0;
				    String X=scan.next();
				    String Y=scan.next();
				    for(int i=0;i<X.length();i++)
				    {
				           if(X.charAt(i)=='?' || Y.charAt(i)=='?'|| X.charAt(i)==Y.charAt(i))
				           {
				               a++;
				           }
				           else{
				               flag++;
				           }
				       }
				    
				     if(flag>0)
				     {
				         System.out.print("No");
				     }
				     else{
				         System.out.print("Yes");
				     }
				}
			}
		}





