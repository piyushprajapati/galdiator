package com.lti.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="state_table")
public class StateNodal {
	
	@Id
	@GeneratedValue
	private int state_id;
	private String state_name;
	private String state_nodal_username;
	private String state_nodal_password;
	
	
	@OneToMany(mappedBy = "stateNodal", cascade = CascadeType.ALL)
	private List<Institute> institutes;
	
	
	@OneToMany(mappedBy = "statenodal", cascade = CascadeType.ALL)
	private List<Application> applications;


	public int getState_id() {
		return state_id;
	}


	public void setState_id(int state_id) {
		this.state_id = state_id;
	}


	public String getState_name() {
		return state_name;
	}


	public void setState_name(String state_name) {
		this.state_name = state_name;
	}


	public String getState_nodal_username() {
		return state_nodal_username;
	}


	public void setState_nodal_username(String state_nodal_username) {
		this.state_nodal_username = state_nodal_username;
	}


	public String getState_nodal_password() {
		return state_nodal_password;
	}


	public void setState_nodal_password(String state_nodal_password) {
		this.state_nodal_password = state_nodal_password;
	}


	public List<Institute> getInstitutes() {
		return institutes;
	}


	public void setInstitutes(List<Institute> institutes) {
		this.institutes = institutes;
	}


	public List<Application> getApplications() {
		return applications;
	}


	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}
	
	
}
