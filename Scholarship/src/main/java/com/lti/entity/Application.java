package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="application_table")
public class Application {
	@Id
	@GeneratedValue
	private int app_id;
	private long aadhar;
	private String religion;
	private String father_name;
	private String mother_name;
	private String community_category; 
	private long annual_income;
	private String present_course;
	private int year;
	private String mode_study;
	private String board_name;
	private LocalDate class_start_date;
	private String prev_course;
	private int prev_passing_year;
	private int prev_passing_percentage; 
	private boolean is_disability;
	private String disability_type;
	private String percentage_disability;
	private boolean marital_status;
	private Occupation parents_profession;
	private String district;
	private String block;
	private int pincode; 
	private int house_no;
	private int street_no;
	private boolean approved_institute;
	private boolean approved_state;
	private boolean approved_ministry;
	
	@ManyToOne
	@JoinColumn(name="student_id_ref")    
	private Student student;
	
	@ManyToOne
	@JoinColumn(name="ins_code_ref")  
	private Institute institute;
	
	@ManyToOne
	@JoinColumn(name="state_id_ref")  
	private StateNodal statenodal;
	
	@OneToOne
	@JoinColumn(name="scheme_no_ref")    
	private Scheme scheme;
	
	@OneToOne(mappedBy = "application_acad", cascade = CascadeType.ALL) 
	private Academic academicDetails;
	
	@OneToOne(mappedBy = "application", cascade = CascadeType.ALL) //check
	private Document document;
	
	

	public int getApp_id() {
		return app_id;
	}

	public void setApp_id(int app_id) {
		this.app_id = app_id;
	}

	public long getAadhar() {
		return aadhar;
	}

	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getFather_name() {
		return father_name;
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public String getMother_name() {
		return mother_name;
	}

	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}

	public String getCommunity_category() {
		return community_category;
	}

	public void setCommunity_category(String community_category) {
		this.community_category = community_category;
	}

	public long getAnnual_income() {
		return annual_income;
	}

	public void setAnnual_income(long annual_income) {
		this.annual_income = annual_income;
	}

	public String getPresent_course() {
		return present_course;
	}

	public void setPresent_course(String present_course) {
		this.present_course = present_course;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMode_study() {
		return mode_study;
	}

	public void setMode_study(String mode_study) {
		this.mode_study = mode_study;
	}

	public String getBoard_name() {
		return board_name;
	}

	public void setBoard_name(String board_name) {
		this.board_name = board_name;
	}

	public LocalDate getClass_start_date() {
		return class_start_date;
	}

	public void setClass_start_date(LocalDate class_start_date) {
		this.class_start_date = class_start_date;
	}

	public String getPrev_course() {
		return prev_course;
	}

	public void setPrev_course(String prev_course) {
		this.prev_course = prev_course;
	}

	public int getPrev_passing_year() {
		return prev_passing_year;
	}

	public void setPrev_passing_year(int prev_passing_year) {
		this.prev_passing_year = prev_passing_year;
	}

	public int getPrev_passing_percentage() {
		return prev_passing_percentage;
	}

	public void setPrev_passing_percentage(int prev_passing_percentage) {
		this.prev_passing_percentage = prev_passing_percentage;
	}

	public boolean isIs_disability() {
		return is_disability;
	}

	public void setIs_disability(boolean is_disability) {
		this.is_disability = is_disability;
	}

	public String getDisability_type() {
		return disability_type;
	}

	public void setDisability_type(String disability_type) {
		this.disability_type = disability_type;
	}

	public String getPercentage_disability() {
		return percentage_disability;
	}

	public void setPercentage_disability(String percentage_disability) {
		this.percentage_disability = percentage_disability;
	}

	public boolean isMarital_status() {
		return marital_status;
	}

	public void setMarital_status(boolean marital_status) {
		this.marital_status = marital_status;
	}

	public Occupation getParents_profession() {
		return parents_profession;
	}

	public void setParents_profession(Occupation parents_profession) {
		this.parents_profession = parents_profession;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getHouse_no() {
		return house_no;
	}

	public void setHouse_no(int house_no) {
		this.house_no = house_no;
	}

	public int getStreet_no() {
		return street_no;
	}

	public void setStreet_no(int street_no) {
		this.street_no = street_no;
	}

	public boolean isApproved_institute() {
		return approved_institute;
	}

	public void setApproved_institute(boolean approved_institute) {
		this.approved_institute = approved_institute;
	}

	public boolean isApproved_state() {
		return approved_state;
	}

	public void setApproved_state(boolean approved_state) {
		this.approved_state = approved_state;
	}

	public boolean isApproved_ministry() {
		return approved_ministry;
	}

	public void setApproved_ministry(boolean approved_ministry) {
		this.approved_ministry = approved_ministry;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Institute getInstitute() {
		return institute;
	}

	public void setInstitute(Institute institute) {
		this.institute = institute;
	}

	public StateNodal getStatenodal() {
		return statenodal;
	}

	public void setStatenodal(StateNodal statenodal) {
		this.statenodal = statenodal;
	}

	public Scheme getScheme() {
		return scheme;
	}

	public void setScheme(Scheme scheme) {
		this.scheme = scheme;
	}

	public Academic getAcademicDetails() {
		return academicDetails;
	}

	public void setAcademicDetails(Academic academicDetails) {
		this.academicDetails = academicDetails;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	
	
	
}
