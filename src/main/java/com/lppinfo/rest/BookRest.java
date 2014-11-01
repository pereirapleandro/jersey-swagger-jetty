package com.lppinfo.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.lppinfo.model.Book;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Path("/book")
@Api(value = "/book", description = "Sample book application")
@Consumes({ MediaType.APPLICATION_JSON + ";charset=\"UTF-8\"", MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML + ";charset=\"UTF-8\"", MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON + ";charset=\"UTF-8\"", MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML + ";charset=\"UTF-8\"", MediaType.APPLICATION_XML })
public class BookRest {

	@GET
	@Path("/list")
	@ApiOperation(value = "Health checker", notes = "This services checks the availability of sheriff dependencies (e.g., Mongodb).", httpMethod = "GET")
	public Book getBooks() {
		Book book = new Book(456, "Java EE 7 Recipes", "Apress", "978-1-4302-4425-7");
		return book;
	}

}