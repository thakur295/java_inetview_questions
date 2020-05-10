package com.practice.main;

public class Fibonaci {
	
	public static void main(String[] args) {
		printfibo(0, 1, 15);
		System.out.println("\nfibonaci at perticular place");
		System.out.println(fibo(5));
	}
	
	private static void printfibo(int prev, int curr, int count) {
		
		if(count < 1) {
			return;
		}
		System.out.printf("%d ",prev);
		printfibo(curr, prev+curr, --count);
		
		
	}
	
	private static int fibo(int n) {
			
			if(n == 0 || n == 1) {
				return 1;
			}
			
			return fibo(n - 1) + fibo(n - 2);
			
			
		}

}
