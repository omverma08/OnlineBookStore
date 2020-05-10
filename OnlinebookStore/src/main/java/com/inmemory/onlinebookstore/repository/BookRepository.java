package com.inmemory.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inmemory.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long>{

}
