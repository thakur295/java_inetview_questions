package com.practice.algo;

import java.util.Scanner;

public class NextPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] inputArray = new int[size];
		int[] outputAray = new int[size+1];
		boolean isAll9 = true;
		for(int i = 0; i < size; i++) {
			inputArray[i] = sc.nextInt();
			if(inputArray[i] != 9)
				isAll9 = false;
		}
		
		if(isAll9) {
			outputAray[0] = 1;
			outputAray[size] = 1;
			for(int i = 1; i < size - 1; i++) {
				outputAray[i] = 0;
			}
			print(outputAray);
		}else {
			int mid = size/2;
			boolean smallLeft = false;
			int i = mid -1;
			int j = size % 2 != 0 ? mid + 1: mid;
			while(i > 0 && j < size 
					&& inputArray[i] == inputArray[j]) {
				
				i--;
				j++;
				
			}
			
			while(i >= 0 && inputArray[i] > inputArray[j]) {
				inputArray[j] = inputArray[i];
				i--;
				j++;
			}
			

			if(i >= 0 & inputArray[i] < inputArray[j])
				smallLeft = true;
			else
				print(inputArray);
			
			if(smallLeft) {
				int cry = 1; 
		          
	            if (size % 2 == 1) { 
	            	inputArray[mid] = inputArray[mid] + 1; 
	                cry = inputArray[mid] / 10; 
	                inputArray[mid] = inputArray[mid] % 10; 
	            } 
	            i = mid - 1; 
	            j = (size % 2 == 0 ? mid : mid + 1); 
	               
	            while (i >= 0)  
	            { 
	            	inputArray[i] = inputArray[i] + cry; 
	                cry = inputArray[i] / 10; 
	                inputArray[i] = inputArray[i] % 10; 
	                inputArray[j] = inputArray[i];
	                i--; 
	                j++; 
	            } 
			}
			print(inputArray);
		}

	}
	
	
	public static void print(int[] inputArray) {
		for(int i = 0 ; i < inputArray.length; i++) {
			System.out.printf("%d ", inputArray[i]);
		}
	}

}
