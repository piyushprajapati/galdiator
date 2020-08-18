package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ministry_table")
public class Ministry {
	
	@Id
	@GeneratedValue
	private int ministry_id;
	private String ministry_username;
	private String ministry_password;
	public int getMinistry_id() {
		return ministry_id;
	}
	public void setMinistry_id(int ministry_id) {
		this.ministry_id = ministry_id;
	}
	public String getMinistry_username() {
		return ministry_username;
	}
	public void setMinistry_username(String ministry_username) {
		this.ministry_username = ministry_username;
	}
	public String getMinistry_password() {
		return ministry_password;
	}
	public void setMinistry_password(String ministry_password) {
		this.ministry_password = ministry_password;
	}
	
	
}
