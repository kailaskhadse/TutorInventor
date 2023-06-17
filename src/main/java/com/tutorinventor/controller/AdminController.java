
package com.tutorinventor.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.tutorinventor.model.Student;
import com.tutorinventor.model.Tutor;
import com.tutorinventor.service.StudentServiceI;
import com.tutorinventor.service.TutorService;



@RestController
public class AdminController {
	
	
@Autowired
StudentServiceI st;
@Autowired
TutorService ts;
	
	@PostMapping("/saveStudent")
	public ResponseEntity<Student> saveStudent(@RequestBody Student s)
	{
	  st.saveStudent(s);
		
		return new ResponseEntity<Student>(s,HttpStatus.CREATED) ;
		
	}

	
	@GetMapping("/getStudent")
	public ResponseEntity<List<Student>>getStudent()
	 {

	    List<Student>list= st.getStudent();
	    
	return new ResponseEntity<List<Student>>(list,HttpStatus.OK) ;
			
		}
	@GetMapping("/searchStudent")
	public ResponseEntity<Student> getSingleStudent(@PathVariable ("studentName") String studentName)
	
	{
	   Student  s=st.getSingleStudent(studentName);
	   
	   return new ResponseEntity<Student>(s,HttpStatus.OK);
	}
	@PutMapping("/updateStudent/{studentId}")
	public ResponseEntity<Student> updateProduct(@PathVariable ("studentId") Integer StudentId,@RequestBody Student s)
	{
		st.saveStudent(s);
		return new ResponseEntity<Student>(s,HttpStatus.CREATED) ;
	}
	 
	public ResponseEntity<Student> deleteStudent(@PathVariable ("studentId") Integer studentId,@RequestBody Student s)
	{
		st.deleteStudent(studentId);
		return new ResponseEntity<Student>(s,HttpStatus.OK);
	}
	@PostMapping("/saveTutor")
	public ResponseEntity<Tutor> saveTutor(@RequestBody Tutor t)
	{
	  ts.saveTutor(t);
		
		return new ResponseEntity<Tutor>(t,HttpStatus.CREATED) ;
		
	}
	@GetMapping("/getTutor")
	public ResponseEntity<List<Tutor>>getTutor()
	 {

	    List<Tutor>list= ts.getTutor();
	    
	return new ResponseEntity<List<Tutor>>(list,HttpStatus.OK) ;
			
		}
	@GetMapping("/searchTutor")
	public ResponseEntity<Tutor> getSingleTutor(@PathVariable ("tutorName") String tutorName)
	
	{
	   Tutor  t=ts.getSingleTutor(tutorName);
	   
	   return new ResponseEntity<Tutor>(t,HttpStatus.OK);
	}
	@PutMapping("/updateTutor/{tutorId}")
	public ResponseEntity<Tutor> updatetutor(@PathVariable ("tutorId") Integer tutorId,@RequestBody Tutor t)
	{
		ts.saveTutor(t);
		return new ResponseEntity<Tutor>(t,HttpStatus.CREATED) ;
	}
	 
	public ResponseEntity<Tutor> deleteTutor(@PathVariable ("tutorId") Integer tutorId,@RequestBody Tutor t)
	{
		ts.deleteTutor(tutorId);
		return new ResponseEntity<Tutor>(t,HttpStatus.OK);
	}
}


	


	
		
	
	
	

