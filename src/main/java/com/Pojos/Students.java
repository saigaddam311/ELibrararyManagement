package com.Pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Students {
	
	@Id
	@GeneratedValue
	private Integer stuid;
	
	private String rollno;
	
	private String stdname;
	
	private String stdmobile;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="bookstdent",joinColumns= {@JoinColumn(name="stuid")},inverseJoinColumns= {@JoinColumn(name="bookno")})
	private List<Addbook> addbooks=new ArrayList<Addbook>();

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