package com.example.jpa.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
//import org.springframework.transaction.annotation.Transactional;

import com.example.jpa.demo.entity.Book;

//@Transactional
public interface BookRepository extends JpaRepository<Book, Integer>  {
	
	//Writing custom query
	//@Query("from Book b where b.available = true")
	//@Query(value = "Select * from Book b where b.available = 1", nativeQuery = true)
	@Query("Select b from Book b where b.available = true")
	List<Book> findAvailableBooks();//bookAvailable 
	
	//search
	@Query("Select b from Book b where b.author = ?1")
	List<Book> findByAuthor(String author);
	
	//available
	@Query("Select b from Book b where b.author = ?1 And b.available = ?2")
	List<Book> findByAuthorAndAvailability(String author, boolean available);
	
	/*@Query("Select b from Book b where b.author = :author")
	List<Book> findByAuthor(@Param("author")String author);
	
	@Query("Select b from Book b where b.author = :author And b.available = :avail Order by title")
	List<Book> findByAuthorAndAvailability(@Param("author")String author,
			@Param("avail")boolean availability);*/
	
	//update
    @Modifying
    @Query("Update Book b set b.title = ?1 where b.bookId = ?2")
	int updateTitleById(String title, int bookId);
	//return type of updateTitleById it is an integer, and will return the number of update records
    
    //delete
    @Modifying
    @Query("Delete from Book b where b.title = ?1")
    void deleteByTitle(String title);
    
    List<Book>findAllNamedQuery();
    
    List<Book> findByTitleNamedQuery(String title);
    
    @Query(nativeQuery = true)
    List<Book> findByAuthorNativeNamedQuery(@Param("author")String author);
    
    
}
