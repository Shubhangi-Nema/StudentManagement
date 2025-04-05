package com.student.management.student_management_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.student.management.student_management_app.entity.Address;
import com.student.management.student_management_app.entity.Course;
import com.student.management.student_management_app.entity.Student;
import com.student.management.student_management_app.repo.CourseRepository;
import com.student.management.student_management_app.repo.StudentRepository;

import jakarta.transaction.Transactional;

@Service
public class StudentService {

	@Autowired
    private CourseRepository courseRepository;
    @Autowired
    private StudentRepository studentRepository;

    public Student addStudent(Student student) {
        if (student.getAddresses() != null) {
            for (Address address : student.getAddresses()) {
                address.setStudent(student); // Set back-reference for JPA
            }
        }
        return studentRepository.save(student);
    }
    public List<Student> getStudentsByName(String name) {
        return studentRepository.findByNameContainingIgnoreCase(name);
    }
   
    public List<Student> getStudentsByCourseId(Long courseId) {
        return studentRepository.findByCoursesId(courseId);
    }
    @Transactional
    public Student updateStudentProfile(Long id, Student updatedStudent) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        student.setEmail(updatedStudent.getEmail());
        student.setMobile(updatedStudent.getMobile());
        student.setFatherName(updatedStudent.getFatherName());
        student.setMotherName(updatedStudent.getMotherName());
        
        if (updatedStudent.getAddresses() != null) {
            for (Address address : updatedStudent.getAddresses()) {
                address.setStudent(student);
            }
            student.setAddresses(updatedStudent.getAddresses());
        }

        return studentRepository.save(student);
    }
	public List<Course> getAssignedCourses(Long id) {
    Student student = studentRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Student not found"));
    return student.getCourses();
}
	public void leaveCourse(Long studentId, Long courseId) {
    Student student = studentRepository.findById(studentId)
            .orElseThrow(() -> new RuntimeException("Student not found"));

    Course course = courseRepository.findById(courseId)
            .orElseThrow(() -> new RuntimeException("Course not found"));

    student.getCourses().remove(course);
    studentRepository.save(student);
}


    

	}

