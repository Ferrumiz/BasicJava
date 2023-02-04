package org.telran.spring.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telran.spring.project.model.Book;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookStorage storage;

    public void addBook(Book book) {
        storage.saveBook(book);

    }

    public boolean loadBookList() {
        return storage.loadBookList();
    }
}
