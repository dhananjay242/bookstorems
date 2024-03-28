package com.booksearch.rest;

import javax.persistence.*;

import lombok.extern.slf4j.Slf4j;


@Entity
@Table(name = "mybookinventory", schema = "jlcbooksdb")
public class BookInventory {
	@Id
	@Column(name = "book_id")
	private Integer bookId;

	@Column(name = "books_available")
	private int booksAvailable;

	public BookInventory() {
		super();
	}

	public BookInventory(Integer bookId, int booksAvailable) {
		super();
		this.bookId = bookId;
		this.booksAvailable = booksAvailable;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public int getBooksAvailable() {
		return booksAvailable;
	}

	public void setBooksAvailable(int booksAvailable) {
		this.booksAvailable = booksAvailable;
	}
	
	
}
