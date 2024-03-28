package com.booksearch.rest;

import javax.persistence.*;

@Entity
@Table(name = "mybookratings", schema = "jlcbooksdb")
public class BookRating {

	@Id
	@Column(name = "book_id")
	private Integer bookId;

	@Column(name = "avg_rating")
	private double avgRating;

	@Column(name = "number_of_searches")
	private int numberOfSearches;

	public BookRating() {
		super();
	}

	public BookRating(Integer bookId, double avgRating, int numberOfSearches) {
		super();
		this.bookId = bookId;
		this.avgRating = avgRating;
		this.numberOfSearches = numberOfSearches;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public double getAvgRating() {
		return avgRating;
	}

	public void setAvgRating(double avgRating) {
		this.avgRating = avgRating;
	}

	public int getNumberOfSearches() {
		return numberOfSearches;
	}

	public void setNumberOfSearches(int numberOfSearches) {
		this.numberOfSearches = numberOfSearches;
	}
	
	
}
