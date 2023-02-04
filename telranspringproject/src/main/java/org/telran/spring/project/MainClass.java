package org.telran.spring.project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.telran.spring.project.lessonone.configuration.AppConfiguration;
import org.telran.spring.project.service.BookService;

import java.awt.print.Book;

public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        BookService bookService = context.getBean(BookService.class);
        Book book = new Book;
        Book book1 = new Book;
        bookService.addBook(book);
        bookService.addBook(book1);

        System.out.println(bookService.loadBookList());

    }
}
