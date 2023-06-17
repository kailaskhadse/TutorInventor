package com.tutorinventor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Integer subjectId;
private String subjectName;
private String standard;
}
