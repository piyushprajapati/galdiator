package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "doc_table")
public class Document {
	
	@Id
	@GeneratedValue
	private int doc_id;
	private String domicile_certificate_doc;
	private String student_photograph_doc;
	private String institute_id_card_doc;
	private String caste_certificate_doc;
	private String prev_year_marksheet_doc;
	private String fee_reciept_current_year_doc;
	private String bank_passbook_doc;
	private String aadhar_card_doc;
	private String marksheet_12th_doc;
	private String marksheet_10th_doc;
	
	@OneToOne
	@JoinColumn(name = "application_id_ref")
	private Application application;
}
