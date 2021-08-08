package com.example.ELB.Service;

import com.example.ELB.Model.Book;
import com.example.ELB.Repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;


@Service
public class BookService {

    private final BookRepo bookRepo;

    @Autowired
    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }
    public  Book addBook(Book book){
        return bookRepo.save(book);
    }

    public  Book findBookByCategory(Long category){
        return bookRepo.findBookByCategory(category);
    }

    public void deleteBookById(Long id){
        bookRepo.deleteById(id);
    }



}
