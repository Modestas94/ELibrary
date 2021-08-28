package com.example.ELB.Service;

import com.example.ELB.Model.Book;
import com.example.ELB.Repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BookService {

    private final BookRepo bookRepo;

    @Autowired
    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public List<Book> findAllBooks() {
        return bookRepo.findAll();
    }

    public Book addBook(Book book) {
        return bookRepo.save(book);
    }

    public List<Book> findBookByCategory(String category) {
        return bookRepo.findBooksByCategory(category);
    }

    public Book findBookById(Long id) {
        return bookRepo.findBookById(id);
    }

    public void deleteBookById(Long id) {
        bookRepo.deleteById(id);
    }

    public Book updateBook(Book book) {
        return bookRepo.save(book);

    }

}
