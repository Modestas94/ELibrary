package com.example.ELB.Repo;

import com.example.ELB.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository <Book,Long> {

     Book findBookByCategory(Long id);

    void deleteBookById(Long id);
}
