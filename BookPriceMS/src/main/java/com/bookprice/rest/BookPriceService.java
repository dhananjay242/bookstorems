package com.bookprice.rest;

import java.util.List;


public interface BookPriceService { 
public BookPrice getBookPriceById(Integer bookId); 
public double getOfferedPriceById(Integer bookId);
public List<BookPrice> getAllBooks(); 
}
