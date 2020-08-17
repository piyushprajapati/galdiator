package com.lti.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.lti.enums.Gender;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue
	private int stu_id;
	private String password;
	private String name;
	private LocalDate dob;
	private long mobile;
	private String email;
	private long aadhar;
	private long acc_no;
	private String ifsc_code;
	private String bank_name;
	//private String gender;     //enum(male,female,other)
	private Gender gender;
	private String state_domicile; //spelling typo domicle
	private String district;
	
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	private List<Application> applications;
	
	
	
	public int getStu_id() {
		return stu_id;
	}



	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public LocalDate getDob() {
		return dob;
	}



	public void setDob(LocalDate dob) {
		this.dob = dob;
	}



	public long getMobile() {
		return mobile;
	}



	public void setMobile(long mobile) {
		this.mobile = mobile;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public long getAadhar() {
		return aadhar;
	}



	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}



	public long getAcc_no() {
		return acc_no;
	}



	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}



	public String getIfsc_code() {
		return ifsc_code;
	}



	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}



	public String getBank_name() {
		return bank_name;
	}



	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}



	public Gender getGender() {
		return gender;
	}



	public void setGender(Gender gender) {
		this.gender = gender;
	}



	public String getState_domicile() {
		return state_domicile;
	}



	public void setState_domicile(String state_domicile) {
		this.state_domicile = state_domicile;
	}



	public String getDistrict() {
		return district;
	}



	public void setDistrict(String district) {
		this.district = district;
	}



	public List<Application> getApplications() {
		return applications;
	}



	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}



	public Student() {}
}
