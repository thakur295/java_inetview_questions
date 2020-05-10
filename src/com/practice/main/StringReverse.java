package com.practice.main;

public class StringReverse {
	
	public static void main(String[] args) {
		String s = "Saura#bh@dbg|";
		char[] str = s.toCharArray();
		for(int i = 0, j = str.length - 1; i < str.length /2; i++, j--) {
			if(str[i] >= 65 && str[i] <= 122 && str[j] >= 65 && str[j] <= 122) {
				swap(str, i, j);
			}else if(str[i] >= 65 && str[i] <= 122 && (str[j] <= 65 || str[j] >= 122)){
				swap(str, i, --j);
			}else if(str[j] >= 65 && str[j] <= 122 && (str[i] <= 65 || str[i] >= 122)) {
				swap(str, --i, j);
			}
		}
		System.out.println("Original String: "+s);
		System.out.println("Reversed String: "+ new String(str));
	}
	
	static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
