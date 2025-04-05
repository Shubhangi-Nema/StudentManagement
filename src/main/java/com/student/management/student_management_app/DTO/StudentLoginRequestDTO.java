package com.student.management.student_management_app.DTO;


	public class StudentLoginRequestDTO {

	    private String studentCode;
	    private String dateOfBirth; // Expected in yyyy-MM-dd format

	    public String getStudentCode() {
	        return studentCode;
	    }

	    public void setStudentCode(String studentCode) {
	        this.studentCode = studentCode;
	    }

	    public String getDateOfBirth() {
	        return dateOfBirth;
	    }

	    public void setDateOfBirth(String dateOfBirth) {
	        this.dateOfBirth = dateOfBirth;
	    }
	}


