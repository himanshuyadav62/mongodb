package com.example.nosql.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.nosql.entity.Author;

public interface AuthorRepo extends MongoRepository<Author, String> {
    
}
