package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.lti.enums.Occupation;

@Entity
@Table(name="application_table")
public class Application {
	
	@Id
	@GeneratedValue
	private int app_id;
	
	@Column(unique = true)
	private long aadhar;
	private String religion;
	private String father_name;
	private String mother_name;
	private String community_category; 
	private long annual_income;
	//private String inst_code;    //int
	private int inst_code;  
	//private String present_code; //present_course typo
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
	private int state;
	private String district;
	private String block;
	private int pincode; 
	private int house_no;
	private int street_no;
	private boolean approved_institute;
	private boolean approved_state;
	private boolean approved_ministry;
	
	
	@OneToOne(mappedBy = "application", cascade = CascadeType.ALL)
	private Document document;
	
	@OneToOne(mappedBy = "application_acad", cascade = CascadeType.ALL)
	private AcademicDetails academicDetails;
	
	@ManyToOne()
	@JoinColumn(name="scheme_no_ref")    
	private Scheme scheme;
	
	@ManyToOne()
	@JoinColumn(name="student_id_ref")    
	private Student student;
	
	@ManyToOne
	@JoinColumn(name="ins_code_ref")  
	private Institute institute;
	
	@ManyToOne
	@JoinColumn(name="state_id_ref")
	private StateNodal stateNodal;   
	
	@ManyToOne
	@JoinColumn(name="ministry_id_ref")
	private Ministry ministry;
	
}
