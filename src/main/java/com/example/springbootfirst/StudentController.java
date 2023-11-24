package com.example.springbootfirst;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Harshal", "Avhad");
	}
/*	@GetMapping("/students")
 public List<Student> getStudents(){
	 
	 List<Student> students = new ArrayList<>();
	 students.add(new Student("Nikita", "Ahire"));
	 students.add(new Student("Sanket", "Avhad"));
	 students.add(new Student("Poonam", "Kakad"));
	 students.add(new Student("Chetan", "Raghav"));
	 students.add(new Student("vishal", "Sanap"));
	 return students;
 }*/
	
	
}
