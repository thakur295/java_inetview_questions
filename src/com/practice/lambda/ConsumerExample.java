package com.practice.lambda;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.practice.model.Student;

public class ConsumerExample {
	
		public static Consumer<Student> studentNameConsumer = (student) -> {
			if(PredicateExample.genderPredicate.test(student))
				System.out.println(student.getName());
		};		
		
		public static BiConsumer<Student, List<String>> bConsumer = (student, activities) -> {
			if(PredicateExample.genderPredicate.and(PredicateExample.gradeLevel2).test(student))
				System.out.println("Name: "+ student.getName() + ", Activities: " + activities);
			
		};

}
