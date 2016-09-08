package com.codercampus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codercampus.domain.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>
{
	
}
