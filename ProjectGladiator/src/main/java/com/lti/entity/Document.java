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

	public int getDoc_id() {
		return doc_id;
	}

	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}

	public String getDomicile_certificate_doc() {
		return domicile_certificate_doc;
	}

	public void setDomicile_certificate_doc(String domicile_certificate_doc) {
		this.domicile_certificate_doc = domicile_certificate_doc;
	}

	public String getStudent_photograph_doc() {
		return student_photograph_doc;
	}

	public void setStudent_photograph_doc(String student_photograph_doc) {
		this.student_photograph_doc = student_photograph_doc;
	}

	public String getInstitute_id_card_doc() {
		return institute_id_card_doc;
	}

	public void setInstitute_id_card_doc(String institute_id_card_doc) {
		this.institute_id_card_doc = institute_id_card_doc;
	}

	public String getCaste_certificate_doc() {
		return caste_certificate_doc;
	}

	public void setCaste_certificate_doc(String caste_certificate_doc) {
		this.caste_certificate_doc = caste_certificate_doc;
	}

	public String getPrev_year_marksheet_doc() {
		return prev_year_marksheet_doc;
	}

	public void setPrev_year_marksheet_doc(String prev_year_marksheet_doc) {
		this.prev_year_marksheet_doc = prev_year_marksheet_doc;
	}

	public String getFee_reciept_current_year_doc() {
		return fee_reciept_current_year_doc;
	}

	public void setFee_reciept_current_year_doc(String fee_reciept_current_year_doc) {
		this.fee_reciept_current_year_doc = fee_reciept_current_year_doc;
	}

	public String getBank_passbook_doc() {
		return bank_passbook_doc;
	}

	public void setBank_passbook_doc(String bank_passbook_doc) {
		this.bank_passbook_doc = bank_passbook_doc;
	}

	public String getAadhar_card_doc() {
		return aadhar_card_doc;
	}

	public void setAadhar_card_doc(String aadhar_card_doc) {
		this.aadhar_card_doc = aadhar_card_doc;
	}

	public String getMarksheet_12th_doc() {
		return marksheet_12th_doc;
	}

	public void setMarksheet_12th_doc(String marksheet_12th_doc) {
		this.marksheet_12th_doc = marksheet_12th_doc;
	}

	public String getMarksheet_10th_doc() {
		return marksheet_10th_doc;
	}

	public void setMarksheet_10th_doc(String marksheet_10th_doc) {
		this.marksheet_10th_doc = marksheet_10th_doc;
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	
}
