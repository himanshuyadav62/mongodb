package com.example.nosql.service;

import org.springframework.stereotype.Service;

import com.example.nosql.entity.Book;
import com.example.nosql.repository.BookRepo;

import java.util.List;

@Service
public class BookService {

    
    private BookRepo bookRepository;

    public BookService(BookRepo bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getBooksByAuthorId(String authorId) {
        return bookRepository.findByAuthorId(authorId);
    }

    public void deleteBook(String id) {
        bookRepository.deleteById(id);
    }

    public Book updateBook(Book book) {
        Book existingBook = bookRepository.findById(book.getId()).orElse(null);
        if(existingBook != null) {
            existingBook.setTitle(book.getTitle());
            existingBook.setPublishedYear(book.getPublishedYear());
            existingBook.setAuthorId(book.getAuthorId());
        }else {
            return null;
        }
        return this.bookRepository.save(existingBook); 
    }

    public Book findBoodById(String id) {
        return this.bookRepository.findById(id).orElse(null);
    }
}
