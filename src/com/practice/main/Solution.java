package com.practice.main;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import au.com.bytecode.opencsv.CSVReader;
public class Solution{

	//	public static void main(String[] args) throws IOException {
	//		      //csv file containing data
	//		      String strFile = "C:\\Users\\saurabh.thakur\\Documents\\a20expences.csv";
	//		      CSVReader reader = new CSVReader(new FileReader(strFile));
	//		      String [] nextLine;
	//		      int lineNumber = 0;
	//		      float spends = 0;
	//		      float pays = 0;
	//		      while ((nextLine = reader.readNext()) != null) {
	//		        lineNumber++;
	//		        if(nextLine.length > 7 && !nextLine[8].isEmpty() && lineNumber > 2) {
	//		        	System.out.println(lineNumber);
	//		        	if(Float.parseFloat(nextLine[8]) > 0)
	//		        		pays = pays + Float.parseFloat(nextLine[8]);
	//		        	else
	//		        		spends = spends + Float.parseFloat(nextLine[8]);
	//		        }
	//		      }
	//		      System.out.println("Total Pays: " + pays);
	//		      System.out.println("Total Spends: " + spends);
 


	public static void main(String[] args) 
	{ 
		int[] a = {5,4,3,6,10};
		
		Set<Integer> set = new TreeSet<Integer>();
		
		for(int i = 0; i < 3;i++) {
			int sum_left = 20 - a[i];
			for(int j = i+1; j<5;j++) {
				if(set.contains(sum_left - a[j]) && (sum_left - a[j]) != (Integer)set.toArray()[set.size() - 1]) {
					System.out.printf("Triplets are %d, %d, %d\n", a[i], a[j], sum_left - a[j]);
					break;
					
				}else {
					System.out.println("aadded " + a[j]);
					set.add(a[j]);
				}
			}
			
		}
	}
}
