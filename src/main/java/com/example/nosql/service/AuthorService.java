package com.example.nosql.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.example.nosql.entity.Author;
import com.example.nosql.repository.AuthorRepo;
import java.util.List;

@Service
public class AuthorService {

    private AuthorRepo authorRepository;

    public AuthorService(AuthorRepo authorRepository) {
        this.authorRepository = authorRepository;
    }


    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }

    public Author getAuthorById(String id) {
        return authorRepository.findById(id).orElse(null);
    }

    public void deleteAuthor(String id) {
        authorRepository.deleteById(id);
    }
}
