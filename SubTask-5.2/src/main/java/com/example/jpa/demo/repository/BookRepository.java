package com.example.jpa.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.jpa.demo.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
	
List<Book>findAllNamedQuery();
    
    List<Book> findByTitleNamedQuery(String title);
    
    @Query(nativeQuery = true)
    List<Book> findByAuthorNativeNamedQuery(@Param("author")String author);
    
    List<Book> findAllXML();
    
    List<Book> findByMinRatingXML(int minRating);
    
    @Query(nativeQuery = true)
    List<Book> findByAuthorNativeXML(@Param("author")String author);
    
    List<Book> findAvailableBooksJPQL();
    
    List<Book> findByRatingJPQL(int minRating);
    
    @Query(nativeQuery = true)
    List<Book> findByTitleNative(@Param("title")String title);

}
