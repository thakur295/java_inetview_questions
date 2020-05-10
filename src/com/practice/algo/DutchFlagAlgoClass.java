package com.practice.algo;

public class DutchFlagAlgoClass {
	
	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 }; 
        int arr_size = arr.length; 
        sortByDuchFlagAlgo(arr, arr_size); 
        System.out.println("Array after seggregation "); 
        for(Integer ar: arr) {
        	System.out.println(ar);
        }
	}

	private static void sortByDuchFlagAlgo(int[] arr, int arr_size) {
		
		int low  = 0, mid = 0, temp = 0, high = arr_size - 1;
		
		while(mid <= high) {
			
			switch(arr[mid]) {
				case 0:{
					swap(arr, low, mid);
					low++;
					mid++;
					break;
				}
				case 1:{
					mid++;
					break;
				}
				case 2:{
					swap(arr, mid, high);
					high--;
					break;
				}
			}
			
		}
		
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	

}
