package com.example.ELB.Controller;

import com.example.ELB.Model.Book;
import com.example.ELB.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = bookService.findAllBooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @GetMapping("/get/{category}")
    public ResponseEntity<List<Book>> getBookByCategory(@PathVariable("category") String category) {
        List<Book> books = bookService.findBookByCategory(category);
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
        @PostMapping("/add")
        public ResponseEntity<Book> addBook (@RequestBody Book book){
            Book addBook = bookService.addBook(book);
            return new ResponseEntity<>(addBook, HttpStatus.CREATED);
        }

        @GetMapping("/find/{id}")
        public ResponseEntity<Book> getBookById (@PathVariable("id") Long id){
            Book books = bookService.findBookById(id);
            return new ResponseEntity<>(books, HttpStatus.OK);

        }

        @DeleteMapping("{id}")
        public ResponseEntity<Void> deleteBookById (@PathVariable("id") Long id){
            try {
                bookService.deleteBookById(id);
            } catch (EmptyResultDataAccessException e) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        @PutMapping("/update")
        public ResponseEntity<Book> updateBook (@RequestBody Book book){
            System.out.println(book);
            Book updateBook = bookService.updateBook(book);
            return new ResponseEntity<>(updateBook, HttpStatus.OK);
        }
    }

