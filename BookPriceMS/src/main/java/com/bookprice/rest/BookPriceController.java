package com.bookprice.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;


@CrossOrigin // CORS
@RestController
public class BookPriceController {
	static Logger log = LoggerFactory.getLogger(BookPriceController.class);
	@Autowired
	BookPriceService bookPriceService;
	
	@Value("${server.port}") 
	String bookPriceServerPort; 


	@GetMapping("/bookPrice/{bookId}")
	@ApiOperation(value = " getBookPrice", response = BookPrice.class, notes = "Gives BookPrice Objectof given bookId")
	public BookPrice getBookPrice(@PathVariable Integer bookId) {
		log.info("---BookPriceController---getBookPrice()-----");
		BookPrice bookPrice = bookPriceService.getBookPriceById(bookId);
		return bookPrice;
	}

	@GetMapping("/offeredPrice/{bookId}")
	@ApiOperation(value = " getOfferedPrice", response = double.class, notes = "Gives Offered Priceof given bookId")
	public double getOfferedPrice(@PathVariable Integer bookId) {
		log.info("---BookPriceController---getOfferedPrice()-----");
		double offeredPrice = bookPriceService.getOfferedPriceById(bookId);
		return offeredPrice;
	}
	
	@GetMapping("/getAllBook")
	@ApiOperation(value = " getBookPrice", response = BookPrice.class, notes = "Gives BookPrice Objectof given bookId")
	public List<BookPrice> getBooks() {
		log.info("---BookPriceController---getBookPrice()-----");
		List<BookPrice> allBooks = bookPriceService.getAllBooks();
		return allBooks;
	}
	
}