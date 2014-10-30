package com.lppinfo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.lppinfo.service.BookService;

@Path("/services")
public class HelloService {

	@GET
	@Path("/books")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public BookService getBooksXml() {

		BookService books = new BookService();
		
		return books;
	}

}