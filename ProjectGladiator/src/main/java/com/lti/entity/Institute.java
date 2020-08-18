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

@Entity
@Table(name="institute_table")
public class Institute {
	
	@Id
	@GeneratedValue
	private int institute_code;
	private String institute_name;
	private InstituteCategory institute_category;
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
	private StateNodal stateNodal;
	
	@ManyToOne
	@JoinColumn(name="ministry_id_ref")
	private Ministry ministry;

	public int getInstitute_code() {
		return institute_code;
	}

	public void setInstitute_code(int institute_code) {
		this.institute_code = institute_code;
	}

	public String getInstitute_name() {
		return institute_name;
	}

	public void setInstitute_name(String institute_name) {
		this.institute_name = institute_name;
	}

	public InstituteCategory getInstitute_category() {
		return institute_category;
	}

	public void setInstitute_category(InstituteCategory institute_category) {
		this.institute_category = institute_category;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDise_code() {
		return dise_code;
	}

	public void setDise_code(String dise_code) {
		this.dise_code = dise_code;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAff_uni_state() {
		return aff_uni_state;
	}

	public void setAff_uni_state(String aff_uni_state) {
		this.aff_uni_state = aff_uni_state;
	}

	public String getAff_uni_name() {
		return aff_uni_name;
	}

	public void setAff_uni_name(String aff_uni_name) {
		this.aff_uni_name = aff_uni_name;
	}

	public int getYear_start() {
		return year_start;
	}

	public void setYear_start(int year_start) {
		this.year_start = year_start;
	}

	public String getInstitute_password() {
		return institute_password;
	}

	public void setInstitute_password(String institute_password) {
		this.institute_password = institute_password;
	}

	public String getInstitute_establishment_certificate_doc() {
		return institute_establishment_certificate_doc;
	}

	public void setInstitute_establishment_certificate_doc(String institute_establishment_certificate_doc) {
		this.institute_establishment_certificate_doc = institute_establishment_certificate_doc;
	}

	public String getUni_affiliation_certificate_doc() {
		return uni_affiliation_certificate_doc;
	}

	public void setUni_affiliation_certificate_doc(String uni_affiliation_certificate_doc) {
		this.uni_affiliation_certificate_doc = uni_affiliation_certificate_doc;
	}

	public String getAdd_line_1() {
		return add_line_1;
	}

	public void setAdd_line_1(String add_line_1) {
		this.add_line_1 = add_line_1;
	}

	public String getAdd_line_2() {
		return add_line_2;
	}

	public void setAdd_line_2(String add_line_2) {
		this.add_line_2 = add_line_2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getPrincipal_name() {
		return principal_name;
	}

	public void setPrincipal_name(String principal_name) {
		this.principal_name = principal_name;
	}

	public int getInstitute_mobile_no() {
		return institute_mobile_no;
	}

	public void setInstitute_mobile_no(int institute_mobile_no) {
		this.institute_mobile_no = institute_mobile_no;
	}

	public int getInstitute_telephone() {
		return institute_telephone;
	}

	public void setInstitute_telephone(int institute_telephone) {
		this.institute_telephone = institute_telephone;
	}

	public boolean isApproved_state_status() {
		return approved_state_status;
	}

	public void setApproved_state_status(boolean approved_state_status) {
		this.approved_state_status = approved_state_status;
	}

	public boolean isApproved_ministry() {
		return approved_ministry;
	}

	public void setApproved_ministry(boolean approved_ministry) {
		this.approved_ministry = approved_ministry;
	}

	public List<Application> getApplications() {
		return applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}

	public StateNodal getStateNodal() {
		return stateNodal;
	}

	public void setStateNodal(StateNodal stateNodal) {
		this.stateNodal = stateNodal;
	}

	public Ministry getMinistry() {
		return ministry;
	}

	public void setMinistry(Ministry ministry) {
		this.ministry = ministry;
	}
	
	
	
}
