package com.example.nosql.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "books")
public class Book {
    @Id
    private String id;
    private String title;
    private int publishedYear;

    // Reference to Author
    private String authorId;
}

    

