package com.springboot.RestApi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.RestApi.entities.Books;
import com.springboot.RestApi.services.BookService;

@RestController
public class BookController 
{
	@Autowired
	private BookService bookService;
	
	//Get All Books Handler	
	@GetMapping("/book")
	//	@ResponseBody
	public ResponseEntity<List<Books>> getBooks()
	{
//		BookService bookService=new BookService();
		List<Books>list=bookService.getAllBooks();
		if(list.size()==0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			
		}	
		System.out.println("books are viewd");
		return ResponseEntity.status(HttpStatus.CREATED).body(list);
	}
	
	//Get Single Book Handler	
	@GetMapping("/book/{id}")
	public ResponseEntity<Books> getBook(@PathVariable("id") int id)
	{
		Books book=bookService.getBookById(id);
		if(book==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(book));
	}
	
	//Add Books Handler
	@PostMapping("/book")
	public ResponseEntity<Books> addBooks(@RequestBody Books book)
	{
		Books b=null;
		try
		{
			 b=this.bookService.addBooks(book);
			 System.out.println(book);
			return ResponseEntity.of(Optional.of(b));
		}catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		
	}
	
	//Delete Books Handler
	@DeleteMapping("/book/{bookId}")
	public ResponseEntity<Void> deleteBooks(@PathVariable("bookId") int bookId)
	{
		try
		{
			this.bookService.deleteBook(bookId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

		}catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	//Update Books Handler
	@PutMapping("/book/{bookId}")
	public ResponseEntity<Books> updateBooks(@RequestBody Books book,@PathVariable("bookId") int bookId)
	{
		try
		{
			this.bookService.updateBooks(book,bookId);
//			return ResponseEntity.status(HttpStatus.OK).build(); OR
			return ResponseEntity.ok().body(book);
			
		}catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
