package org.telran.spring.project.model;

import org.springframework.stereotype.Component;
//@Component, @Service, @Controller, for DB @Repository, web @RestController
@Component("superbook")
public class Book {
    private String name;

    public Book() {
        this.name = "Book one";
    }

    public String getName() {
        return name;
    }
}
