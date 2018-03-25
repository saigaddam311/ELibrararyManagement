package com.Pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LibrarianRegister {

	@Id
	@GeneratedValue
	private int librarianId;
	private String librarianName;
	private String librarianEmail;
	private String librarianPassword;
	private String librarianMobileNumber;

	public int getLibrarianId() {
		return librarianId;
	}

	public void setLibrarianId(int librarianId) {
		this.librarianId = librarianId;
	}

	public String getLibrarianName() {
		return librarianName;
	}

	public void setLibrarianName(String librarianName) {
		this.librarianName = librarianName;
	}

	public String getLibrarianEmail() {
		return librarianEmail;
	}

	public void setLibrarianEmail(String librarianEmail) {
		this.librarianEmail = librarianEmail;
	}

	public String getLibrarianPassword() {
		return librarianPassword;
	}

	public void setLibrarianPassword(String librarianPassword) {
		this.librarianPassword = librarianPassword;
	}

	public String getLibrarianMobileNumber() {
		return librarianMobileNumber;
	}

	public void setLibrarianMobileNumber(String librarianMobileNumber) {
		this.librarianMobileNumber = librarianMobileNumber;
	}

}
