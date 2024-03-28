//package com.bookstore.web;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class UserController {
//	@GetMapping("/")
//	public String showIndexPage(Model model) {
//		System.out.println("** showIndexPage **");
//		return "index";
//	}
//
//	@GetMapping("/viewBooks")
//	public String showViewBooksPage(Model model) {
//		System.out.println("** showViewBooksPage **");
//		return "viewBooks";
//	}
//
//	@GetMapping("/addBook")
//	public String showAddBookPage(Model model) {
//		System.out.println("** showAddBookPage **");
//		return "addBook";
//	}
//
//	@GetMapping("/editBook")
//	public String showEditBookPage(Model model) {
//		System.out.println("** showEditBookPage **");
//		return "editBook";
//	}
//
//	@GetMapping("/deleteBook")
//	public String showDeleteBookPage(Model model) {
//		System.out.println("** showDeleteBookPage **");
//		return "deleteBook";
//	}
//
//	@GetMapping("/placeOrder")
//	public String showPlaceOrderPage(Model model) {
//		System.out.println("** showPlaceOrderPage **");
//		return "placeOrder";
//	}
//}