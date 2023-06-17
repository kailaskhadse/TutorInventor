package com.tutorinventor.service;

import java.util.List;

import com.tutorinventor.model.Tutor;

public interface TutorService {
	public void saveTutor(Tutor t);

	public List<Tutor> getTutor();

	public Tutor getSingleTutor(String tutorName);

	public void deleteTutor(Integer tutorId);

}
