package com.lppinfo.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.lppinfo.model.Book;
import com.lppinfo.service.BookService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

import exception.NotFoundException;

@Path("/book")
@Api(value = "/book", description = "Sample book application")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class BookRest {

	@GET
	@Path("/")
	@ApiOperation(value = "List Books", notes = "This services list all books", response = List.class)
	public BookService getBooks() {
		return new BookService();
	}

	@GET
	@Path("/{id}")
	@ApiOperation(value = "Find book by ID", notes = "Returns a book", response = Book.class)
	@ApiResponses(value = { @ApiResponse(code = 404, message = "Book not found") })
	public Response getBookById(@ApiParam(value = "ID of book", required = true) @PathParam("id") Integer id) {
		BookService service = new BookService();
		for (Book book : service.getBooks()) {
			if (book.getId() == id) {
				return Response.ok().entity(book).build();
			}
		}
		return Response
				.status(Response.Status.NOT_FOUND)
				.entity(new NotFoundException(Response.Status.NOT_FOUND.getStatusCode(), "Book not found for id: " + id))
				.build();
	}

}