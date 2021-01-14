package com.rank.SpringLoggingSample.service;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.rank.SpringLoggingSample.model.Book;

@Service
public class BookService {
	
	private static final Logger logger=LoggerFactory.getLogger(BookService.class);
	public List<Book> getListBook(){
		
		logger.debug("Inside the getListBook service class ");
		
		return Arrays.asList(new Book(1, "Book A"),new Book(2, "Book B"));
		
		
		
	}

}
