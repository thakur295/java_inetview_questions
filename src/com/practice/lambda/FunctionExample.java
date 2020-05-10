package com.practice.lambda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.practice.model.Student;

public class FunctionExample {
	
	public static Function<List<Student>, Map<String, String>> studentMapFunction = (students) -> {
		
		Map<String, String> newMap = new HashMap<>();
		students.forEach(student -> {
			if(PredicateExample.genderPredicate.test(student)) {
				newMap.put(student.getName(), student.getGender()); 
			}
		});
		
		return newMap;
	};

}
