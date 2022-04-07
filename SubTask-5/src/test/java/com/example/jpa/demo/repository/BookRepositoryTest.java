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
	public void saveBook(){
		
		bookRepository.save(new Book("Anna Karenina","Leo Tolstoy",9, true));
		bookRepository.save(new Book("Pride and Prejudice","Jane Austen",8, false));
		bookRepository.save(new Book("The Merchant of Venice","Shakesphere",8, true));
		bookRepository.save(new Book("A Tale of Two Cities","Charles Dickens",5, true));
		bookRepository.save(new Book("The Tunnel","William H. Gass",4, false));
		
	}
	
	@Test
	public void bookAvailable() {
		
		System.out.println("\n************");
		System.out.println("\nQuering for available books.....");
		
		List<Book> availableBooks = bookRepository.findAvailableBooks();
		System.out.println("\nOUTPUT:\n" + availableBooks.toString());
		
		System.out.println("\n**************");
	}
	
	@Test
	public void search() {
		
		//bookRepository.save(new Book("King Lear","Shakesphere",6, true));
		//bookRepository.save(new Book("Macbeth","Shakesphere",7, false));
		
		System.out.println("\n************");
		System.out.println("\nQuering for books authored by Shakesphere......");
		
		List<Book> books = bookRepository.findByAuthor("Shakesphere");
		System.out.println("\nOUTPUT:\n" + books.toString());
		
		System.out.println("\n**************");
		
	}
	
	@Test
	public void available() {
		
		
		System.out.println("\n************");
		System.out.println("\nQuering for books authored by Shakesphere......");
		
		List<Book> books = bookRepository.findByAuthorAndAvailability("Shakesphere",true);
		System.out.println("\nOUTPUT:\n" + books.toString());
		
		System.out.println("\n**************");
		
	}
	
	@Test
	public void availableParam() {
		
		
		System.out.println("\n************");
		
		System.out.println("\nBooks authored by Shakesphere......");
		List<Book> books = bookRepository.findByAuthor("Shakesphere");
		System.out.println("\nOUTPUT:\n" + books.toString());
		
		System.out.println("\nBooks authored by Shakesphere......");
		 books = bookRepository.findByAuthorAndAvailability("Shakesphere",true);
		System.out.println("\nOUTPUT:\n" + books.toString());
		
		System.out.println("\n**************");
		
	}
	
	@Test
	public void update(){
		
		System.out.println("\n*************");
		System.out.println("Updating one of the books.....");
		
		bookRepository.updateTitleById("The Tempest", 3);
		
		System.out.println("\nBooks authored by Shakesphere.....");
		List<Book> books = bookRepository.findByAuthor("Shakesphere");
		System.out.println("\nOUTPUT:\n" + books.toString());
		
		System.out.println("\n**************");
		
	}
	
	@Test
	public void delete(){
		
		System.out.println("\n*************");
		System.out.println("Deleting one of the books.....");
		
		bookRepository.deleteByTitle("The Tunnel");
		
		System.out.println("\nAll the books in the store.....");
		for(Book book : bookRepository.findAll())//invoked find all method
		System.out.println("\nOUTPUT:\n" + book.toString());
		
		System.out.println("\n**************");
		
	}
	
	@Test
	public void propertiesFile() {
		
		System.out.println("\n************");
		
		System.out.println("Retrieving all books.....");
		List<Book> books = bookRepository.findAllNamedQuery();
		
		System.out.println("\nOUTPUT:\n" +books.toString());
		System.out.println("\n***********");
		
		System.out.println("Retrieving books based on title.....");
		 books = bookRepository.findByTitleNamedQuery("Pride and Prejudice");
		
		System.out.println("\nOUTPUT:\n" +books.toString());
		System.out.println("\n***********");
		
		System.out.println("Retrieving books based on author.....");
		 books = bookRepository.findByAuthorNativeNamedQuery("Shakespeare");
		
		System.out.println("\nOUTPUT:\n" +books.toString());
		System.out.println("\n***********");
		
		
	}

}
