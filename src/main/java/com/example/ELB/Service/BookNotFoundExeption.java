package com.example.ELB.Service;

import org.springframework.http.HttpStatus;

public class BookNotFoundExeption  extends RuntimeException{

    public BookNotFoundExeption(HttpStatus message){
        super(String.valueOf(message));
    }
}
