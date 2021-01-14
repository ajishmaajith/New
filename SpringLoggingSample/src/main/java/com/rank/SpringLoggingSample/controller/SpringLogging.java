package com.rank.SpringLoggingSample.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rank.SpringLoggingSample.model.Book;
import com.rank.SpringLoggingSample.service.BookService;

@RestController
public class SpringLogging {
    private static final Logger logger = LoggerFactory.getLogger(BookService.class);

	@Autowired
	BookService service;
	
	
	
	@GetMapping("listBooks")
	public List<Book> getBooks(){
		
		logger.debug("inside the controller");
		return service.getListBook();
		
	}

}
