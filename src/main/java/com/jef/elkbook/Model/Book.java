package com.jef.elkbook.Model;

import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "books")
@AllArgsConstructor
public class Book {
    @Id
    private String id;
    private String title;
    private String author;
    private String releaseDate;

    public Book(String title, String author, String releaseDate) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
    }

}
