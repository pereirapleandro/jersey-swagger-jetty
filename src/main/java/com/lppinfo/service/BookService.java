package com.lppinfo.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import com.lppinfo.model.Book;

@XmlRootElement
public class BookService {

	private List<Book> books = new ArrayList<Book>();
	
	{

		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();

		book1.setId(123);
		book1.setName("Java Cookbook, 2nd Edition");
		book1.setPublisher("O'Reilly Media");
		book1.setIsbn("978-0-59600-701-0");
		
		book2.setId(456);
		book2.setName("Java EE 7 Recipes");
		book2.setPublisher("Apress");
		book2.setIsbn("978-1-4302-4425-7");
		
		book3.setId(789);
		book3.setName("Beginning Java 8 Fundamentals");
		book3.setPublisher("Apress");
		book3.setIsbn("978-1-4302-6652-5");

		books.add(book1);
		books.add(book2);
		books.add(book3);
	}

	@XmlElement(name = "books")
	public List<Book> getBooks() {
		return books;
	}

}
