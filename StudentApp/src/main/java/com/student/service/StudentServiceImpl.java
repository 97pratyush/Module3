package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.beans.Student;
import com.student.dao.StudentRepository;
import com.student.exception.StudentException;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> getStudentList() throws StudentException {
		return studentRepository.findAll();
	}

	@Override
	public List<Student> addStudent(Student stud) throws StudentException {
		if (studentRepository.existsById(stud.getId())) {
			throw new StudentException();
		}
		studentRepository.save(stud);
		return getStudentList();
	}

	@Override
	public List<Student> deleteStudent(int id) throws StudentException {
		if (studentRepository.existsById(id)) {
			studentRepository.deleteById(id);
			return getStudentList();
		} else {
			throw new StudentException();
		}
	}

	@Override
	public List<Student> updateStudent(Student stud) throws StudentException {
		Student tempStudent = getStudentById(stud.getId());
		tempStudent.setStream(stud.getStream());
		tempStudent.setAge(stud.getAge());
		return null;
	}

	@Override
	public Student getStudentById(int id) throws StudentException {
		return studentRepository.findById(id).get();
	}

}
