package com.codercampus.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Course
{
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	private String description;
	
	@OneToMany (mappedBy="course")
	private Set<Lesson> lessons = new HashSet<Lesson>();
	
	public Set<Lesson> getLessons() {
		return lessons;
	}
	public void setLessons(Set<Lesson> lessons) {
		this.lessons = lessons;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
