package com.tap.package1;

import java.util.Arrays;
import java.util.Scanner;

public class esttt {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read input values
	        int n = scanner.nextInt(); // Number of chocolate packets
	        int x = scanner.nextInt(); // Number of students
	        int[] arr = new int[n];    // Array to store the number of toffees in each packet

	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        // Sort the array in ascending order
	        Arrays.sort(arr);

	        // Initialize the minimum difference to a large value
	        int minDifference = Integer.MAX_VALUE;

	        // Find the minimum difference between consecutive elements for the first x elements
	        for (int i = 0; i + x - 1 < n; i++) {
	            int difference = arr[i + x - 1] - arr[i];
	            if (difference < minDifference) {
	                minDifference = difference;
	            }
	        }

	        System.out.println(minDifference);

	        scanner.close();
	    }
	}


