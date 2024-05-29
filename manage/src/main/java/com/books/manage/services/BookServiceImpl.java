package com.books.manage.services;

import com.books.manage.dto.UpdateBookDTO;
import com.books.manage.exception.BookException;
import com.books.manage.models.Book;
import com.books.manage.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepo bookRepo;

    @Override
    public Book createBook(Book book){

        return bookRepo.save(book);

    }

    @Override
    public Book updateBook(Integer bookId, UpdateBookDTO newBook) {

        Optional<Book> opBook=bookRepo.findById(bookId);

        if(opBook.isPresent()){
            Book oldBook=opBook.get();
            if( newBook.getAuthor() != null && newBook.getAuthor() !="" )
                oldBook.setAuthor(newBook.getAuthor());


            if( newBook.getTitle() != null && newBook.getTitle() !="" )
                oldBook.setTitle(newBook.getTitle());

            if( newBook.getISBN() != null && newBook.getISBN() !="" )
                oldBook.setISBN(newBook.getISBN());


            if( newBook.getPublication_date() != null )
                oldBook.setPublication_date(newBook.getPublication_date());


            return bookRepo.save(oldBook);


        }
        throw new BookException("No Book entry found with "+bookId+" Id");


    }


    @Override
    public Book readBook(Integer bookId){
        Optional<Book> book=bookRepo.findById(bookId);

        if(book.isPresent()) {
            return book.get();
        }

       throw new BookException("No Book entry found with "+bookId+" boodId");

    }

    @Override
    public List<Book> readAllBooks(){

        List<Book> book=bookRepo.findAll();

        if(book.size()>0) {
            return book;
        }

        throw new BookException("No Book entry found ");

    }


    @Override
    public String deleteBook(Integer bookId){

        Optional<Book> book=bookRepo.findById(bookId);

        if(book.isPresent()) {
             bookRepo.deleteById(bookId);
             return "Book entry deletion success";
        }
        else throw new BookException("No Book entry found with "+bookId+" boodId");

    }
}
