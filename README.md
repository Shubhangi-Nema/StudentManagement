# StudentManagement
Developed a REST API for a Student Management System that will allow a school to efficiently manage student admissions, courses, and enrollments

# Student and Course Management Backend

## Overview
This project is a backend system for managing students and courses, built using **Spring Boot**, **JPA with Hibernate**, **REST APIs**, and **Spring Security**. The application is designed with two main user roles: **Admin** and **Student**. It includes functionalities for both user types, allowing admins to manage student and course data, while students can view and enroll in courses, manage their profile, and more.

## Features

### Admin Functionalities:
- **Add Students**: Admin can add students with their personal details (including multiple addresses).
- **Add Courses**: Admin can add courses and assign topics to each course.
- **Assign Courses to Students**: Admin can assign specific courses to students.
- **Search Students**: Admin can search for students by their details.

### Student Functionalities:
- **Profile Management**: Students can manage their profile, including email, mobile number, parents’ names, and address updates.
- **Course Search**: Students can search for available courses.
- **Course Enrollment**: Students can enroll in courses and view assigned courses and topics.
- **Leave Course**: Students can leave a course if they are no longer interested.

### Security:
- **Admin Authentication**: Admin login is implemented using a **username/password** combination.
- **Student Validation**: Students are validated using **student_code** and **date_of_birth** to ensure secure access to their profiles and functionalities.

## Technologies Used
- **Java**: Core language used for building the application.
- **Spring Boot**: Framework for creating the backend REST API services.
- **Spring Security**: Authentication and authorization for users.
- **JPA & Hibernate**: ORM for managing entities and database interaction.
- **REST APIs**: Exposed endpoints for various functionalities.
- **MySQL**: Database for storing student and course data.

## Project Setup

### Prerequisites
- JDK 11 or higher.
- Maven for dependency management.
- MySQL database (or any other supported DB) for data persistence.

### Steps to Run Locally

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/StudentManagement.git
   cd StudentManagement

### API documentation for managing students and courses
http://localhost:8080/swagger-ui/index.html

### Postman endpoints are attached to test

