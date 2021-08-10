package com.example.ELB.Controller;

import com.example.ELB.Model.Book;
import com.example.ELB.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class BookController {

    @Autowired
    private BookService bookService;


    @PostMapping("/add")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book addBook = bookService.addBook(book);
        return new ResponseEntity<>(addBook, HttpStatus.CREATED);
    }

    @GetMapping("/find/{category}")
    public ResponseEntity<Book> getBookByCategory(@PathVariable("category") Long category) {
        Book books = bookService.findBookByCategory(category);
        return new ResponseEntity<>(books, HttpStatus.OK);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteBookById(@PathVariable("id") Long id) {
        try {
            bookService.deleteBookById(id);
        } catch (EmptyResultDataAccessException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/update")
    public ResponseEntity<Book> updateBook(@RequestBody Book book) {
        Book updateBook = bookService.updateBook(book);
        return new ResponseEntity<>(updateBook, HttpStatus.OK);
    }
}

