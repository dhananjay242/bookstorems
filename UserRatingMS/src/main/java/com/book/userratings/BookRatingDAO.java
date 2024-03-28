package com.book.userratings;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* 
* @Author : Srinivas Dande 
* @company : Java Learning Center 
* */
@Repository
public interface BookRatingDAO extends JpaRepository<BookRating, Integer> {
	public BookRating findBookRatingByBookId(Integer bookId);
}
