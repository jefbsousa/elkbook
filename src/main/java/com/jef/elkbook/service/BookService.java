package com.jef.elkbook.service;

import com.jef.elkbook.Model.Book;
import com.jef.elkbook.Repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {
    private BookRepository bookRepository;

    public List<Book> findByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

}
