package com.practice.lambda;

import java.util.List;
import java.util.function.Predicate;

import com.practice.model.Student;
import com.practice.model.StudentDataBase;

public class PredicateExample {
		public static Predicate<Student> genderPredicate = (student) -> "male".equals(student.getGender());
		public static Predicate<Student> gradeLevel2 = (student) -> 2 == student.getGradeLevel();
}
