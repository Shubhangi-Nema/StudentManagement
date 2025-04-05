package com.student.management.student_management_app.DTO;

import com.student.management.student_management_app.entity.Address;
import lombok.Data;

import java.util.List;

@Data
public class ProfileUpdate {
    private String email;
    private String mobile;
    private String fatherName;
    private String motherName;
    private List<Address> addresses;
// Optional: You could also use AddressDTO here
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
}

