package com.practice.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.practice.lambda.PredicateExample;
import com.practice.model.Student;
import com.practice.model.StudentDataBase;

public class StreamsExample {
	
	public static void main(String[] args) {
		Map<String, List<String>> studentMap = StudentDataBase.getAllStudents()
				.stream()
			    .filter(PredicateExample.gradeLevel2)
				.filter(PredicateExample.genderPredicate)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println(studentMap);
		
		
		//map
		System.out.println(StudentDataBase.getAllStudents()
				.stream()
			    .map(Student::getName)
			    .map(String::toUpperCase)
				.collect(Collectors.toList()));
		
		//flatMap
		System.out.println(StudentDataBase.getAllStudents()
				.stream()
			    .map(Student::getActivities)
			    .flatMap(List::stream)
				.collect(Collectors.toList()));
		//distinct and sorted
		System.out.println(StudentDataBase.getAllStudents()
				.stream()
			    .map(Student::getActivities)
			    .flatMap(List::stream)
			    .distinct()
			    .sorted()
				.collect(Collectors.toList()));
		
		//distinct and sorted
		System.out.println(StudentDataBase.getAllStudents()
				.stream()
			    .sorted(Comparator.comparingInt((Student::getGradeLevel)))
				.collect(Collectors.toList()));
	}

}
