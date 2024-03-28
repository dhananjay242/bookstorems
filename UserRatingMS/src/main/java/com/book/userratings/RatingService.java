package com.book.userratings; 
import java.util.List; 
/* 
* @Author : Srinivas Dande 
* @company : Java Learning Center 
* */ 
public interface RatingService { 
 public void addUserRating(UserRating userRating); 
 public List<UserRating> getUserRatingByBookId(Integer bookId); 
 public List<UserRating> getUserRatingByUserId(String userId); 
 public BookRating getBookRatingByBookId(Integer bookId); 
}