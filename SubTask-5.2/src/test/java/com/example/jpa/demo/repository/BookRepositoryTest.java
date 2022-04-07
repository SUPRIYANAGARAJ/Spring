package com.example.jpa.demo.repository;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.jpa.demo.entity.Book;

@SpringBootTest
public class BookRepositoryTest {
	
	@Autowired
	private BookRepository bookRepository;
	
	@Test
	public void file() {
		
		System.out.println("\n************");
		
		System.out.println("Retrieving all books.....");
		List<Book> books = bookRepository.findAllXML();
		
		System.out.println("\nOUTPUT:\n" +books.toString());
		System.out.println("\n***********");
		
		System.out.println("Retrieving books based on rating.....");
		books = bookRepository.findByMinRatingXML(8);
		
		System.out.println("\nOUTPUT:\n" +books.toString());
		System.out.println("\n***********");
		
		System.out.println("Retrieving books based on author.....");
		books = bookRepository.findByAuthorNativeXML("Shakesphere");
		
		System.out.println("\nOUTPUT:\n" +books.toString());
		System.out.println("\n***********");
		
		
	}
	

	@Test
	public void file1() {
		
		System.out.println("\n************");
		
		System.out.println("Retrieving available books.....");
		List<Book> books = bookRepository.findAvailableBooksJPQL();
		
		System.out.println("\nOUTPUT:\n" +books.toString());
		System.out.println("\n***********");
		
		System.out.println("Retrieving books based on rating.....");
		books = bookRepository.findByRatingJPQL(8);
		
		System.out.println("\nOUTPUT:\n" +books.toString());
		System.out.println("\n***********");
		
		System.out.println("Retrieving books based on title.....");
		books = bookRepository.findByTitleNative("Anna Karenina");
		
		System.out.println("\nOUTPUT:\n" +books.toString());
		System.out.println("\n***********");
		
		
	}
	
	

}
