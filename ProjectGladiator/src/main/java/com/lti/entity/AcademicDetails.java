package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "academic_table")
public class AcademicDetails {
	
	@Id
	@GeneratedValue
	private int acad_id;
	
	private long roll_no_10;
	private long roll_no_12;
	private String board_10;
	private String board_12;
	private int passing_year_10;
	private int passing_year_12;
	private double percentage_10;
	private double percentage_12;
	
	@OneToOne
	@JoinColumn(name = "application_id_ref")
	private Application application_acad;
	
}
