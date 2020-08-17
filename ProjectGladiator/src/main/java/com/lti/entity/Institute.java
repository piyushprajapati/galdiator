package com.lti.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.lti.enums.InstituteCategory;
import com.sun.xml.bind.v2.runtime.unmarshaller.UnmarshallingContext.State;

@Entity
@Table(name="institute_table")
public class Institute {
	
	@Id
	@GeneratedValue
	private int institute_code;
	private String institute_name;
	private InstituteCategory institute_category;
	//private String state; //int
	private int state;
	private String district;
	private String dise_code;
	private String location;
	private String aff_uni_state;
	private String aff_uni_name;
	private int year_start;
	private String institute_password;
	private String institute_establishment_certificate_doc;
	private String uni_affiliation_certificate_doc;
	private String add_line_1;
	private String add_line_2;
	private String city;
	//private String pincode; //int
	private int pincode;
	private String principal_name;
	private int institute_mobile_no;
	private int institute_telephone;
	private boolean approved_state_status;
	private boolean approved_ministry;
	
	@OneToMany(mappedBy = "institute", cascade = CascadeType.ALL) 
	private List<Application> applications;
	
	@ManyToOne
	@JoinColumn(name="state_id_ref")
	private StateNodal stateNodal_Min;
	
	@ManyToOne
	@JoinColumn(name="ministry_id_ref")
	private Ministry ministry;
	
}
