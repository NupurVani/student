package com.cg.jpacrud.service;

import java.util.List;

import com.cg.jpacrud.entities.Book;

public interface BookService {

	public abstract Book getBookById(int id);

	public abstract List<Book> getAuthorBooks(String author);

	public abstract List<Book> getAllBooks();

	public abstract List<Book> getBooksInPriceRange(int low, int high);
}