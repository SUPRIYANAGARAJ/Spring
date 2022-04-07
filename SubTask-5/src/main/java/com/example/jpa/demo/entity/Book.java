package com.example.jpa.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
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
