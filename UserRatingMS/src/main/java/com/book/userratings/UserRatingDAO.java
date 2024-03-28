package com.book.userratings;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* 
* @Author : Srinivas Dande 
* @company : Java Learning Center 
* */
@Repository
public interface UserRatingDAO extends JpaRepository<UserRating, Integer> {
	public List<UserRating> findUserRatingByBookId(Integer bookId);

	public List<UserRating> findUserRatingByUserId(String userId);
}
