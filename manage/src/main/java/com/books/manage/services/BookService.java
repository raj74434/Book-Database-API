package com.books.manage.services;

import com.books.manage.dto.UpdateBookDTO;
import com.books.manage.models.Book;

import java.util.List;

public interface BookService {

    public Book createBook(Book book);

    public Book updateBook(Integer bookId, UpdateBookDTO newBook);

    public Book readBook(Integer bookId);

    public List<Book> readAllBooks();

    public String deleteBook(Integer bookId);
}
