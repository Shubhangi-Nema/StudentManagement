package com.student.management.student_management_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.student.management.student_management_app.entity.Course;
import com.student.management.student_management_app.service.CourseService;

import java.util.List;

@RestController
@RequestMapping("/admin/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping ("/add")
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @PostMapping("/assign")
    public Course assignCourseToStudent(@RequestParam Long studentId, @RequestParam Long courseId) {
        return courseService.assignCourseToStudent(studentId, courseId);
    }
}
