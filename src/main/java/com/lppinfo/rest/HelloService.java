package com.lppinfo.rest;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Path("/services")
public class HelloService {

	@GET
	@Path("/books")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Books getBooksXml() {

		Books books = new Books();
		List<Book> bookList = returnData();
		books.setBooks(bookList);

		return books;
	}

	private List<Book> returnData() {

		ArrayList<Book> names = new ArrayList<Book>();

		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();

		b1.setName("book nro. 1");
		b1.setId(0);
		b2.setName("book nro. 2");
		b2.setId(1);
		b3.setName("book nro. 3");
		b3.setId(2);

		names.add(b1);
		names.add(b2);
		names.add(b3);

		return names;
	}

}

class Book {

	private Integer id;
	private String name;

	public void setId(Integer id) {
		this.id = id;
	}

	@XmlAttribute
	public Integer getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public String getName() {
		return name;
	}
}

@XmlRootElement
class Books {

	private List<Book> books;

	@XmlElement(name = "book")
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

}