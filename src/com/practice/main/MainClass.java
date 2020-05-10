package com.practice.main;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.practice.lambda.ConsumerExample;
import com.practice.lambda.FunctionExample;
import com.practice.model.Student;
import com.practice.model.StudentDataBase;

public class MainClass {
	public static void main(String[] args) {
		
		List<Student> studentsList = StudentDataBase.getAllStudents();
		studentsList.forEach((student)->ConsumerExample.studentNameConsumer.accept(student));
		studentsList.forEach((student)->ConsumerExample.bConsumer.accept(student, student.getActivities()));
		Map<String, String> functionalMap= FunctionExample.studentMapFunction.apply(studentsList);
		System.out.println(functionalMap);
		for (Map.Entry<String, String> entity: functionalMap.entrySet()) {
			System.out.println("Name: "+ entity.getKey() + "gender: "+ entity.getValue());
			
		}
	}

}
