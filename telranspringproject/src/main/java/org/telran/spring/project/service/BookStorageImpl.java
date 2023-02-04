package org.telran.spring.project.service;

import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookStorageImpl implements BookStorage {

    private List<Book> bookList = new ArrayList<>();

    @Override
    public void saveBook(Book book) {

    }

    @Override
    public List<Book> loadBookList() {
        return bookList;
    }
}
