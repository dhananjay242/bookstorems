package com.booksearch.rest;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.ApiOperation;


@CrossOrigin
@RestController
public class BookSearchController {
	static Logger log = LoggerFactory.getLogger(BookSearchController.class);
	@Autowired
	BookService bookService;

	@GetMapping("/mybooks/{author}/{category}")
	@ApiOperation(value = " getBooks", response = List.class, notes = "Returns List of Books for given Author and Category")
	public List<Book> getBooks(@PathVariable String author, @PathVariable String category) {
		log.info("---BookSearchController---getBooks()-----");
		System.out.println(author + "\t" + category);
		return bookService.getBooks(author, category);
	}

	@GetMapping("/mybook/{bookId}")
	@ApiOperation(value = " getBookById", response = BookInfo.class, notes = "Returns BookInfo for given BID")
	public BookInfo getBookById(@PathVariable Integer bookId) {
		log.info("---BookSearchController---getBookById()-----");
		return bookService.getBookInfo(bookId);
	}

	@PutMapping("/updateBookRating")
	@ApiOperation(value = " updateBookRating", response = void.class, notes = "updateBookRating")
	public void updateBookRating(@RequestBody BookRating bookRating) {
		System.out.println("-------BookSearchController-----updateBookRating()-----");
		bookService.updateBookRating(bookRating);
	}

	@PutMapping("/updateBookInventory")
	@ApiOperation(value = " updateBookInventory", response = void.class, notes = "updateBookInventory")
	public void updateBookInventory(@RequestBody BookInventory bookInventory) {
		System.out.println("-------BookSearchController-----updateBookInventory()-----");
		bookService.updateBookInventory(bookInventory);
	}
}