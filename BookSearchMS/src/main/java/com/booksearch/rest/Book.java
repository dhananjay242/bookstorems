package com.booksearch.rest;

import javax.persistence.*;


/* 
* @Author : Srinivas Dande 
* @company : Java Learning Center 
* */
@Entity
@Table(name = "mybooks", schema = "jlcbooksdb")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "book_id")
	private Integer bookId;

	@Column(name = "book_name")
	private String bookName;

	@Column(name = "author")
	private String author;

	@Column(name = "publications")
	private String publications;

	@Column(name = "category")
	private String category;

	public Book() {
		super();
	}
	
	public Book(Integer bookId, String bookName, String author, String publications, String category) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.publications = publications;
		this.category = category;
	}



	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublications() {
		return publications;
	}

	public void setPublications(String publications) {
		this.publications = publications;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
}