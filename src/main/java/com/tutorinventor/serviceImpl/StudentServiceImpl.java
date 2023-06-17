package com.tutorinventor.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorinventor.model.Student;
import com.tutorinventor.repository.StudentRepository;
import com.tutorinventor.service.StudentServiceI;
@Service
public class StudentServiceImpl implements StudentServiceI {
	@Autowired
StudentRepository sr;
	@Override
	public void saveStudent(Student s) {
		// TODO Auto-generated method stub
		sr.save(s);
	}

	@Override
	public List<Student> getStudent() {
		
		return sr.findAll();
	}

	@Override
	public Student getSingleStudent(String studentName) {
		// TODO Auto-generated method stub
		return sr.findByName(studentName);
	}

	@Override
	public void deleteStudent(Integer studentId) {
		sr.deleteById(studentId);
		
	}

		
	}


