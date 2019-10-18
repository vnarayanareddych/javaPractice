package com.narayana.java8;

import java.util.Arrays;
import java.util.OptionalLong;

public class FindLeastMinimumPositiveInteger {

	public static void main(String[] args) {

		int[] input = { 1, 2, 3, 4, -2, -10, -32, 45, 3, 7, 9, 0 };

		OptionalLong value = Arrays.stream(input).filter(p -> p >= 0).mapToLong(k -> k).min();

		Long out = value.getAsLong();
		
		int finOut = out.intValue();
		
		System.out.println("Minimum Positive Integer in an array : " + finOut );
	}
}
