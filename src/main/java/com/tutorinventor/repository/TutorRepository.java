package com.tutorinventor.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorinventor.model.Tutor;





@Repository
public interface TutorRepository extends JpaRepository<Tutor,Integer> {
 public Tutor findByName(String tutorName);
}
