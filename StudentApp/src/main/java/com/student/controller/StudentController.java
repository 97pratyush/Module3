package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.beans.Student;
import com.student.exception.StudentException;
import com.student.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/students")
	public List<Student> getStudentList() throws StudentException {
		return studentService.getStudentList();
	}
	
	@PostMapping("/students/add")
	public List<Student> addStudent(@RequestBody Student stud) throws StudentException {
		return studentService.addStudent(stud);
	}
	
	@DeleteMapping("/students{id}")
	public List<Student> deleteStudent(@PathVariable int id) throws StudentException {
		return studentService.deleteStudent(id);
	}
	
	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable int id) throws StudentException {
		return studentService.getStudentById(id);
	}
}
