package com.practice.algo;

public class RotatedSortedArray {
	
	static int pivotedBinarySearch(int[] arr, int size, int key) {
		int pivot = findPivot(arr, 0, size-1);
		if(arr[pivot] == key)
			return pivot;
		else if(arr[0] > key)
			return binarySearch(arr, pivot + 1, size -1, key);
		else 
			return binarySearch(arr, 0,pivot - 1, key);
			
	}
	
	static int binarySearch(int[] arr, int low, int high, int key) {
		if(low > high)
			return -1;
		int mid = (low + high)/2;
		if(arr[mid] == key)
			return mid;
		else if(arr[mid] > key)
			return binarySearch(arr, low, mid -1, key);
		else
			return binarySearch(arr, mid + 1, high, key);
	}
	
	static int findPivot(int[] arr, int low, int high) {
		
		int mid = (low + high) / 2;
		
		if(low > high)
			return -1;
		if(arr[mid + 1] < arr[mid] && arr[mid - 1] < arr[mid])
			return mid;
		else if(arr[low] < arr[mid])
			return findPivot(arr, mid +1, high);
		else
			return findPivot(arr, low, mid -1);
	}
	
	public static int searchInaRotatedArray(int ar[], int low, int high, int key) {
		if(low > high)
			return -1;
		int mid = (low+high)/2;
		if(ar[mid] == key)
			return mid;
		else if(ar[low] <= ar[mid]) {
			if(key >= ar[low] && key <= ar[mid])
				return searchInaRotatedArray(ar, low, mid - 1, key);
			return searchInaRotatedArray(ar, mid + 1, high, key);
		}
		else {
			if(key >= ar[mid] && ar[high] >= key)
				return searchInaRotatedArray(ar, mid + 1, high, key);
			else
				return searchInaRotatedArray(ar, low, mid -1, key);
		}
	}
	
	public static void main(String[] args) {
		
		   // Let us search 3 in below array 
	       int arr1[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}; 
	       int n = arr1.length; 
	       int key = 6; 
	       System.out.println("Index of the element is via pivot: "
	                      + pivotedBinarySearch(arr1, n, key)); 
	       
	       System.out.println("Index of the element is simple binary: "
                   + searchInaRotatedArray(arr1, 0,n-1, key)); 
		
	}

}
