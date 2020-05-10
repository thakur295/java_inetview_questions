package com.practice.algo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FunWithVowels {
	
	public static void main(String args[] ) throws Exception {
	        Scanner s = new Scanner(System.in);
	        String inputString = s.nextLine();
	        System.out.println(getLongestVowelSeq(inputString));

	    }
	private static int getLongestVowelSeq(String inputString){
	        

//	        //aaaeeeeegjbodnodfnboidnbooofksdvipsfvifbondfbonfklkvssifuu
//	        //aeiouaeiouaeiouaaeeiioouu
//	        //aaejkioou
		
		Map<Character, Character> vowelMap = new HashMap<Character, Character>();
		vowelMap.put('e', 'a');
		vowelMap.put('i', 'e');
		vowelMap.put('o', 'i');
		vowelMap.put('u', 'o');
	    Map<Character, Integer> vowelCount = new HashMap<Character, Integer>();
	    int stringLength = inputString.length();
	    for (int i = 0; i < stringLength; i++) {
	        char ch = inputString.charAt(i);
	        int count = 0;
	        if (ch == 'a') {
	        	count = vowelCount.get(ch) == null? 1 : vowelCount.get('a') + 1;
	        }else if(vowelCount.get(ch) == null) {
				count = vowelCount.get(vowelMap.get(ch)) != null ?
						vowelCount.get(vowelMap.get(ch)) + 1: 0;
			}else {
				count = vowelCount.get(ch).compareTo(vowelCount.get(vowelMap.get(ch))) == 1 ?
	        			vowelCount.get(ch) + 1: 
	        			vowelCount.get(vowelMap.get(ch)) + 1;
	        		
			}
	        vowelCount.put(ch, count);
	    }
	    return vowelCount.get('u');
	}

}
