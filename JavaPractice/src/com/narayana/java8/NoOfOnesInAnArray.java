package com.narayana.java8;

import java.util.Arrays;

public class NoOfOnesInAnArray {

	public static void main(String[] args) {
		int[] input = {1,2,3,1,7,44,32,87,12,86};
		
		//Solution 1
		int count = (int) Arrays.stream(input).filter(p -> p==1).count();
		System.out.println("No of ones in an Array: " + count);
		
		
		//Solution 2
		//if casting from Long to Int doesnt work in codelity
		Long countOnes = Arrays.stream(input).filter(p -> p==1).count();
		
		int out = countOnes.intValue();
		
		System.out.println("No of ones in an Array: "+ out);
		
	}
}
