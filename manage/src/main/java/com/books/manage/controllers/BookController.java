package com.books.manage.controllers;

import com.books.manage.dto.UpdateBookDTO;
import com.books.manage.models.Book;
import com.books.manage.services.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@Validated
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/")
    public ResponseEntity<Book> createBookEntry(@Valid @RequestBody Book book){
        return  new ResponseEntity<>(bookService.createBook(book),HttpStatus.CREATED);
    }

    @GetMapping("/{bookId}")
    public ResponseEntity<Book> getBookEntryById(@PathVariable Integer bookId){
        return new ResponseEntity<>(bookService.readBook(bookId), HttpStatus.OK);
    }
    @GetMapping("/")
    public ResponseEntity<List<Book>> getAllEntry(){
        return new ResponseEntity<>(bookService.readAllBooks(), HttpStatus.OK);
    }

    @PutMapping("/{bookId}")
    public ResponseEntity<Book> UpdateBookEntry(@RequestBody UpdateBookDTO bookDto,
                                                @PathVariable Integer bookId){
        return  new ResponseEntity<>(bookService.updateBook(bookId,bookDto),HttpStatus.ACCEPTED);
    }


    @DeleteMapping("/{bookId}")
    public ResponseEntity<String> DeleteBookEntry(@PathVariable Integer bookId){
        return  new ResponseEntity<>(bookService.deleteBook(bookId),HttpStatus.ACCEPTED);
    }

}
