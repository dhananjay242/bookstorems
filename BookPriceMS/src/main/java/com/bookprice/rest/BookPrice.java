package com.bookprice.rest;

import javax.persistence.*;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "mybookprice", schema = "jlcbookpricedb")
@ApiModel("BookPrice which contains BookId, price and offer/discount")
public class BookPrice {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bookId_generator")
	@SequenceGenerator(name = "bookId_generator", sequenceName = "mybookId_gen", initialValue = 110, allocationSize = 1)
	@Column(name = "book_id")
	@ApiModelProperty("holds BookId")
	private Integer bookId;
	@Column(name = "price")
	@ApiModelProperty("holds price")
	private double price;
	@Column(name = "offer")
	@ApiModelProperty("holds offer/discount")
	private double offer;
	
	public BookPrice() {
		super();
	}
	public BookPrice(Integer bookId, double price, double offer) {
		super();
		this.bookId = bookId;
		this.price = price;
		this.offer = offer;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getOffer() {
		return offer;
	}
	public void setOffer(double offer) {
		this.offer = offer;
	}
	
	

}