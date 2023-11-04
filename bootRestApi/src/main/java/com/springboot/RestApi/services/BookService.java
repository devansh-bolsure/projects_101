package com.springboot.RestApi.services;

//import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.RestApi.dao.BookRepository;
import com.springboot.RestApi.entities.Books;

@Component
public  class BookService 
{
	
//	private static List<Books> list=new ArrayList<>();
//	static
//	{
//		list.add(new Books(478,"Gege Akutami","Jujutsu Kaisen"));
//		list.add(new Books(756,"Toriyma","Dragob ball"));
//		list.add(new Books(908,"Murata","One Punch Man"));
//	}
	@Autowired
	private BookRepository bookRepository;
	
	//get list of all books
	public List<Books> getAllBooks()
	{
		List<Books> list = (List<Books>) this.bookRepository.findAll();
		return list;
	}
	
	//get book by id	
	public Books getBookById(int id)
	{
		Books book=null;
		try
		{
//			book=list.stream().filter(e->e.getId()==id).findFirst().get();
		book = this.bookRepository.findById(id);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("book with given id is viewd");
		return book;
	}

	//adding books using post method
	public Books addBooks(Books b)
	{
//		list.add(b);
//		System.out.println("book is added");
//		System.out.println(list);
		Books result=this.bookRepository.save(b);
		System.out.println("book is added");
		return result;
	}
	
	//deleting books using delete method
	public void deleteBook(int bid)
	{
//		list=list.stream().filter(book->book.getId()!=bid).collect(Collectors.toList());
		this.bookRepository.deleteById(bid);
		System.out.println("book is deleted");
	}
	//update books
	public void updateBooks(Books book, int bookId)
	{
//		list=list.stream().map(b->
//		{if(b.getId()==bookId)
//			{
//				b.setTitle(book.getTitle());
//				b.setAuthor(book.getAuthor());
//			}
//			return b;	
//		}).collect(Collectors.toList());
		book.setId(bookId);
		
		this.bookRepository.save(book);
		
		System.out.println("put method is used");
		System.out.println(book);
		
	}
	
}
