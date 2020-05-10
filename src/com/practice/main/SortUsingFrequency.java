package com.practice.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Collections.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortUsingFrequency {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(5);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(1);
		list.add(4);
		list.add(5);
		list.forEach((a) -> System.out.println(a));
		System.out.println("Sorted list");
		sortFrequency(list);
		
	}
	
	@SuppressWarnings("unchecked")
	private static void sortFrequency(List<Integer> arr){
		Map<Integer, Integer> coutMap = new HashMap<>();
		arr.forEach((a) ->{
			if(coutMap.containsKey(a)) {
				int val = coutMap.get(a);
				coutMap.put(a, ++val);
			}else {
				coutMap.put(a, 1);
			}
		});
		
		System.out.println(coutMap);
		
		System.out.println("streamSort");
		
		coutMap.entrySet().stream()
		.sorted(Map.Entry.comparingByValue())
		.collect(Collectors
				.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                LinkedHashMap::new)).entrySet().forEach((a) -> System.out.println(a.getKey()));
		
		System.out.println("ListSort");
		
		List<Map.Entry<Integer, Integer>> list = 
	               new LinkedList<Map.Entry<Integer, Integer>>(coutMap.entrySet()); 
		
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				if(o1.getValue() > o2.getValue())
					return 1;
				else if(o1.getValue() < o2.getValue())
					return -1;
				return 0;
			}
		});
		
		//coutMap.clear();
		Map<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>(); 
        for (Map.Entry<Integer, Integer> aa : list) { 
        	temp.put(aa.getKey(), aa.getValue()); 
        } 
        
        temp.entrySet().forEach((obj)-> System.out.println(obj.getKey()));
	}

}
