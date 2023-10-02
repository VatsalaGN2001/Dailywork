package com.tap.package1;

import java.util.Scanner;

public class day30 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        for (int t = 0; t < T; t++) {
            int N = scan.nextInt();
            scan.nextLine();
            String S = scan.nextLine();

            for (int i = 0; i < N; i = i + 2) {
                if (S.charAt(i) == '0' && S.charAt(i + 1) == '0') {
                    System.out.print("A");
                } else if (S.charAt(i) == '0' && S.charAt(i + 1) == '1') {
                    System.out.print("T");
                } else if (S.charAt(i) == '1' && S.charAt(i + 1) == '0') {
                    System.out.print("C");
                } else if (S.charAt(i) == '1' && S.charAt(i + 1) == '1') {
                    System.out.print("G");
                }
            }
            System.out.println();
        }
    }
}
		 
	

