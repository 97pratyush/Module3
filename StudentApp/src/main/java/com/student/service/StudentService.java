package com.student.service;

import java.util.List;

import com.student.beans.Student;
import com.student.exception.StudentException;

public interface StudentService {
	
	List<Student> getStudentList() throws StudentException;
	List<Student> addStudent(Student stud) throws StudentException;
	List<Student> deleteStudent(int id) throws StudentException;
	List<Student> updateStudent(Student stud) throws StudentException;
	Student getStudentById(int id) throws StudentException;
}
