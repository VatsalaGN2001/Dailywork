package com.tap.package1;

import java.util.HashMap;

public class yhjnf {
		    public static void main(String[] args) {
	        int[] arr = {8, 0, 1, 0, 1, 0, 0, 1, 1};
	        int result = findMaxLengthSubarray(arr);
	        System.out.println(result);
	    }

	    static int findMaxLengthSubarray(int[] arr) {
	        int maxLength = 0;
	        int count = 0;
	        int n = arr.length;
	        HashMap<Integer, Integer> countMap = new HashMap<>();

	        for (int i = 0; i < n; i++) {
	            if (arr[i] == 0) {
	                count--;
	            } else {
	                count++;
	            }

	            if (count == 0) {
	                maxLength = i + 1;
	            } else {
	                if (countMap.containsKey(count)) {
	                    int prevIndex = countMap.get(count);
	                    maxLength = Math.max(maxLength, i - prevIndex);
	                } else {
	                    countMap.put(count, i);
	                }
	            }
	        }

	        return maxLength;
	    }
	}


