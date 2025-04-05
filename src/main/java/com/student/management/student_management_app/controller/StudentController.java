package com.student.management.student_management_app.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.student.management.student_management_app.entity.Course;
import com.student.management.student_management_app.entity.Student;
import com.student.management.student_management_app.service.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@PutMapping("/{id}/update-profile")
	public ResponseEntity<Student> updateStudentProfile(@PathVariable Long id, @RequestBody Student updatedStudent) {
	    return ResponseEntity.ok(studentService.updateStudentProfile(id, updatedStudent));
	}
	
	@GetMapping("/{id}/courses")
	public ResponseEntity<List<Course>> getAssignedCourses(@PathVariable Long id) {
	    return ResponseEntity.ok(studentService.getAssignedCourses(id));
	}
	@DeleteMapping("/{studentId}/leave-course/{courseId}")
	public ResponseEntity<String> leaveCourse(@PathVariable Long studentId, @PathVariable Long courseId) {
	    studentService.leaveCourse(studentId, courseId);
	    return ResponseEntity.ok("Course removed successfully.");
	}
}
