package com.example.nosql.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.nosql.entity.Book;

public interface BookRepo extends MongoRepository<Book, String> {
    List<Book> findByAuthorId(String authorId);
    
}
