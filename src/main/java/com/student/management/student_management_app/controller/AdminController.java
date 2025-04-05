package com.student.management.student_management_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.student.management.student_management_app.entity.Student;
import com.student.management.student_management_app.service.StudentService;

@RestController
@RequestMapping("/admin/students")
public class AdminController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/admit")
    public Student admitStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }
    // Search by name
    @GetMapping("/search")
    public List<Student> searchStudentsByName(@RequestParam String name) {
        return studentService.getStudentsByName(name);
    }

    // Get students by course ID
    @GetMapping("/by-course")
    public List<Student> getStudentsByCourse(@RequestParam Long courseId) {
        return studentService.getStudentsByCourseId(courseId);
    }
}
