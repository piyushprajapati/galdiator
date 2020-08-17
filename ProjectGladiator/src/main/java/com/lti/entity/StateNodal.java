package com.lti.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class StateNodal {
	
	@Id
	@GeneratedValue
	private int state_id;
	private String state_name;
	private String state_nodal_username;
	private String state_nodal_password;
	
	//@OneToMany(mappedBy = "instituteState", cascade = CascadeType.ALL)  //wrong
	@OneToMany(mappedBy = "stateNodal", cascade = CascadeType.ALL)
	private List<Institute> institutes;
	
	//@OneToMany(mappedBy = "applicationState", cascade = CascadeType.ALL) //wrong
	@OneToMany(mappedBy = "stateNodal", cascade = CascadeType.ALL)
	private List<Application> applications;
}