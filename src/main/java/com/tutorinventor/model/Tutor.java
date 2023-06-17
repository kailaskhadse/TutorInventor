package com.tutorinventor.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tutor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer tutorId;
	private String tutorName;
	private String educationQualification;
	private Long mobileNo;
	private String email;
	@OneToMany
	private Set<Subject>subject;
	private double fees;
	private String username;
	private String password;

}
