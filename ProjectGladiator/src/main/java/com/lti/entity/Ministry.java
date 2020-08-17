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
}
