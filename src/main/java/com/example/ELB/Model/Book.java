package com.example.ELB.Model;

import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String author;
    private String category;
    private String status;

    public Book(String name, String author, String category) {
    }

    public Book(Long id, String name, String author, String category, String status ) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.category = category;
        this.status = status;
    }

    public Book() {}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}




