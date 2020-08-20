package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "academic_table")
public class Academic {
	
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

	public int getAcad_id() {
		return acad_id;
	}

	public void setAcad_id(int acad_id) {
		this.acad_id = acad_id;
	}

	public long getRoll_no_10() {
		return roll_no_10;
	}

	public void setRoll_no_10(long roll_no_10) {
		this.roll_no_10 = roll_no_10;
	}

	public long getRoll_no_12() {
		return roll_no_12;
	}

	public void setRoll_no_12(long roll_no_12) {
		this.roll_no_12 = roll_no_12;
	}

	public String getBoard_10() {
		return board_10;
	}

	public void setBoard_10(String board_10) {
		this.board_10 = board_10;
	}

	public String getBoard_12() {
		return board_12;
	}

	public void setBoard_12(String board_12) {
		this.board_12 = board_12;
	}

	public int getPassing_year_10() {
		return passing_year_10;
	}

	public void setPassing_year_10(int passing_year_10) {
		this.passing_year_10 = passing_year_10;
	}

	public int getPassing_year_12() {
		return passing_year_12;
	}

	public void setPassing_year_12(int passing_year_12) {
		this.passing_year_12 = passing_year_12;
	}

	public double getPercentage_10() {
		return percentage_10;
	}

	public void setPercentage_10(double percentage_10) {
		this.percentage_10 = percentage_10;
	}

	public double getPercentage_12() {
		return percentage_12;
	}

	public void setPercentage_12(double percentage_12) {
		this.percentage_12 = percentage_12;
	}

	public Application getApplication_acad() {
		return application_acad;
	}

	public void setApplication_acad(Application application_acad) {
		this.application_acad = application_acad;
	}
	
	

}
