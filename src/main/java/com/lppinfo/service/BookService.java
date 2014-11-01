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
		Book book1 = new Book(123, "Java Cookbook, 2nd Edition", "O'Reilly Media", "978-0-59600-701-0");;
		Book book2 = new Book(456, "Java EE 7 Recipes", "Apress", "978-1-4302-4425-7");

		books.add(book1);
		books.add(book2);
	}

	@XmlElement(name = "books")
	public List<Book> getBooks() {
		return books;
	}

}
