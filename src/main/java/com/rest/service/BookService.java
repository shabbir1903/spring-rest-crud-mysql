package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.dao.BookRepository;
import com.rest.model.Book;

@Service
public class BookService {

	@Autowired
	private BookRepository repository;

	public List<Book> findAllBooks() {
		return repository.findAll();// select * from Book
	}

}
