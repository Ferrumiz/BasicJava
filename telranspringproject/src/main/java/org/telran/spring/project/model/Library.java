package org.telran.spring.project.model;

import org.springframework.stereotype.Component;


public class Library {

    private String name;

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
