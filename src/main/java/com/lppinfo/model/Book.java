package com.lppinfo.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Book")
public class Book implements Serializable {

	private static final long serialVersionUID = 165437642268559516L;

	private long id;
	private String isbn;
	private String name;
	private String publisher;
	
	public Book() {
		super();
	}

	public Book(long id, String isbn, String name, String publisher) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.name = name;
		this.publisher = publisher;
	}

	@XmlAttribute
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@XmlElement
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}