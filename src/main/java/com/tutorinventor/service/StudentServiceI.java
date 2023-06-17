package com.tutorinventor.service;


import java.util.List;

import com.tutorinventor.model.Student;

public interface StudentServiceI {

	public void saveStudent(Student s);

	public List<Student> getStudent();

	public Student getSingleStudent(String studentName);

	public void deleteStudent(Integer studentId);

	
}
