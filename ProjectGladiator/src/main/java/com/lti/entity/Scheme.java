package com.lti.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.lti.enums.SchemeType;

@Entity
@Table(name="scheme_table")
public class Scheme {
	
	@Id
	@GeneratedValue
	private int scheme_no;
	private String scheme_detail;
	private SchemeType scheme_type;
	
	/*
	@OneToOne
	@JoinColumn(name = "application_id_ref")
	private Application application;
	*/
	
	@OneToMany(mappedBy = "scheme", cascade = CascadeType.ALL)
	private Application application_scheme;
}
