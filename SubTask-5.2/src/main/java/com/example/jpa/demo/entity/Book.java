package com.example.jpa.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity

@NamedQuery(name = "Book.findAvailableBooksJPQL",query = "Select b from Book b where b.available = 1")
@NamedQuery(name = "Book.findByRatingJPQL",query = "Select b from Book b where b.rating >= ?1")
@NamedNativeQuery(name = "Book.findByTitleNative",query = "Select * from Book b where b.title = :title", resultClass = Book.class)

@Table(name = "Book")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;
	private String title;
	private String author;
	private int rating;
	private boolean available;
	
	public Book() {
		super();
    }

	public Book(String title, String author, int rating, boolean available) {
		super();
		this.title = title;
		this.author = author;
		this.rating = rating;
		this.available = available;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", rating=" + rating
				+ ", available=" + available + "]";
	}
	
	

}
