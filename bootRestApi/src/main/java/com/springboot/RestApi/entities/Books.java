package com.springboot.RestApi.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
@Table(name="Book_Details")
public class Books 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id")
	private int id;
	private String title;
	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	private Author author;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public Author getAuthor() 
	{
		return author;
	}
	public void setAuthor(Author author) 
	{
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}
	
	public Books(int id, Author author, String title) 
	{
		super();
		this.id = id;
		this.author = author;
		this.title = title;
	}
	
	public Books() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() 
	{
		return "Books [id=" + id + ", author=" + author + ", title=" + title + "]";
	}
	
}
