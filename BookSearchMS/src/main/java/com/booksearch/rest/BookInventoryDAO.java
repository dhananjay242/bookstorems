package com.booksearch.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* 
* @Author : Srinivas Dande 
* @company : Java Learning Center 
* */
@Repository
public interface BookInventoryDAO extends JpaRepository<BookInventory, Integer> {
}
