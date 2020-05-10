package com.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {
	
	public static int sumOfNumbers(List<Integer> integerList) {
		return integerList.stream().reduce(0, (a,b)->a+b);
	}
	
	public static int sumOfNumbersIntStream(List<Integer> integerList) {
		//return integerList.stream().reduce(0, (a,b)->a+b);
		return IntStream.rangeClosed(1, 10).sum();
	}
	
	public static void main(String[] args) {
		
		List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,8,96,100);
		System.out.println(sumOfNumbers(integerList));
		System.out.println(Runtime.getRuntime().availableProcessors());
	}

}
