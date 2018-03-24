package com.Pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Students {
	
	@Id
	@GeneratedValue
	private Integer stuid;
	
	private String rollno;
	
	private String stdname;
	
	private String stdmobile;

	public Integer getStuid() {
		return stuid;
	}

	public void setStuid(Integer stuid) {
		this.stuid = stuid;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public String getStdmobile() {
		return stdmobile;
	}

	public void setStdmobile(String stdmobile) {
		this.stdmobile = stdmobile;
	}

		
}