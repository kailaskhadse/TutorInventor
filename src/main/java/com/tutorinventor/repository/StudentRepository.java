package com.tutorinventor.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorinventor.model.Student;






@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
	public Student findByName(String studentName);

}
