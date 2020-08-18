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
	
	@OneToMany(mappedBy = "scheme", cascade = CascadeType.ALL)
	private Application application_scheme;

	public int getScheme_no() {
		return scheme_no;
	}

	public void setScheme_no(int scheme_no) {
		this.scheme_no = scheme_no;
	}

	public String getScheme_detail() {
		return scheme_detail;
	}

	public void setScheme_detail(String scheme_detail) {
		this.scheme_detail = scheme_detail;
	}

	public SchemeType getScheme_type() {
		return scheme_type;
	}

	public void setScheme_type(SchemeType scheme_type) {
		this.scheme_type = scheme_type;
	}

	public Application getApplication_scheme() {
		return application_scheme;
	}

	public void setApplication_scheme(Application application_scheme) {
		this.application_scheme = application_scheme;
	}
	
	
}