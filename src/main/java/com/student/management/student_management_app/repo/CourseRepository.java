package com.student.management.student_management_app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.management.student_management_app.entity.Course;


public interface CourseRepository extends JpaRepository<Course, Long> {} 


