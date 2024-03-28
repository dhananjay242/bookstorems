package com.book.placeorder.rest;

import java.util.List;

public interface OrderService {
	public void placeOrder(OrderInfo orderInfo);

	public List<Order> getOrdersByUserId(String userId);

	public List<Order> getAllPlacedOrders();
}