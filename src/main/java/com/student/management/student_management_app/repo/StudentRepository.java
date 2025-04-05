package com.student.management.student_management_app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import com.student.management.student_management_app.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	 List<Student> findByNameContainingIgnoreCase(String name);
	
	    List<Student> findByCoursesId(Long courseId);
}
