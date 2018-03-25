package com.Pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Columns;

@Entity
public class Addbook {
	@Id
	private Integer bookno;
	
	private String name;
	
	private String author;
	
	private String publisher;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="bookstdent",joinColumns= {@JoinColumn(name="bookno")},inverseJoinColumns= {@JoinColumn(name="stuid")})
	private List<Students> students=new ArrayList<Students>();
	
	public Integer getBookno() {
		return bookno;
	}
	public void setBookno(Integer bookno) {
		this.bookno = bookno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
