package com.student.management.student_management_app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.management.student_management_app.DTO.StudentLoginRequestDTO;
import com.student.management.student_management_app.entity.Student;
import com.student.management.student_management_app.repo.StudentRepository;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@RestController
@RequestMapping("/student")
public class StudentAuthController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/login")
    public ResponseEntity<?> validateStudent(@RequestBody StudentLoginRequestDTO request) {
        String code = request.getStudentCode();
        String dobString = request.getDateOfBirth();

        Date parsedDob;
        try {
            parsedDob = new SimpleDateFormat("yyyy-MM-dd").parse(dobString);
        } catch (ParseException e) {
            return ResponseEntity.badRequest().body("Invalid date format. Expected yyyy-MM-dd");
        }

        List<Student> students = studentRepository.findAll();
        for (Student student : students) {
            if (student.getStudentCode().equals(code) &&
                student.getDateOfBirth().compareTo(parsedDob) == 0) {
                return ResponseEntity.ok("Student validated successfully.");
            }
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid student credentials.");
    }
}


