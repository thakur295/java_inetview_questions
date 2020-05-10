package com.practice.lambda;

import java.util.Comparator;

public class ComparatorLambdaExample {
	public static void main(String[] args) {
		
		Comparator<Integer> comp = (Integer a, Integer b) -> a.compareTo(b);
		System.out.println(comp.compare(6, 6));
		
	}
}
