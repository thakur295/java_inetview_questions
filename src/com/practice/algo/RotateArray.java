package com.practice.algo;

public class RotateArray {

	public static void main(String[] args) {
		
        int arr[] = { 1, 2, 3, 4, 5, 6 }; 
        System.out.println("array before rotation");
        for (int i : arr) {
			System.out.print(i + " ");
		}
        leftRotate(arr, 2, arr.length);
        System.out.println("\narray after rotation"); 
        for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	private static void leftRotate(int[] arr, int ele, int size) {
		
		int gcd = gcd(ele, size);
		
		for(int i = 0; i < ele; i++) {
			int temp = arr[i];
			
			if(gcd == 1){
				temp = arr[0];
				for(int j = 1; j < size; j++) {
					arr[j - 1] = arr[j];
				}
				arr[size -1] = temp;
			}else {
				int j = i +gcd;
				for(; j < size; j =j+gcd) {
					arr[j-gcd] = arr[j];
				}
				arr[j - gcd] = temp;
			}
		}
	}

	private static int gcd(int a, int b) {
		if(b == 0)
			return a;
		return gcd(b, a % b);
	}

}
