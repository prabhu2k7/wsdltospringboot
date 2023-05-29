package com.wstutorial.ws.tutorialservice;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;

import java.util.ArrayList;

@Entity
@Table(name = "tutorial_type")
public class TutorialType {

	private long id;
	private String name;
	private String author;
	
	
	
 
	
	public TutorialType() {
		
	}


	public TutorialType(String firstName, String name, String author) {
		this.name = name;
		this.author = author;
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "name", nullable = false)
	public String getFirstName() {
		return name;
	}
	public void setFirstName(String firstName) {
		this.name = firstName;
	}
	
	@Column(name = "author", nullable = false)
	public String getLastName() {
		return author;
	}
	public void setLastName(String lastName) {
		this.author = lastName;
	}
	
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", author="+ "]";
	}
	
}
