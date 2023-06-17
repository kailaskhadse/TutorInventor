package com.tutorinventor.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorinventor.model.Tutor;
import com.tutorinventor.repository.TutorRepository;
import com.tutorinventor.service.TutorService;
@Service
public class TutorServiceImpl implements TutorService {
	@Autowired
	TutorRepository tr;

	@Override
	public void saveTutor(Tutor t) {
		tr.save(t);
		
	}

	@Override
	public List<Tutor> getTutor() {
		// TODO Auto-generated method stub
		return tr.findAll();
	}

	@Override
	public Tutor getSingleTutor(String tutorName) {
		// TODO Auto-generated method stub
		return tr.findByName(tutorName);
	}

	@Override
	public void deleteTutor(Integer tutorId) {
		// TODO Auto-generated method stub
		tr.deleteById(tutorId);
	}

}
