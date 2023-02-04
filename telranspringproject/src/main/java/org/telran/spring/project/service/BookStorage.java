package org.telran.spring.project.service;

import java.awt.print.Book;
import java.util.List;

public interface BookStorage {
    public void saveBook(Book book);

    public List<Book> loadBookList();
}
