package org.telran.spring.project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.telran.spring.project.lessonone.configuration.AppConfiguration;
import org.telran.spring.project.model.Book;
import org.telran.spring.project.model.Library;

public class App {
    public static void main(String[] args) {
        //Annotation config(automatic)
//        AnnotationConfigApplicationContext context
//                = new AnnotationConfigApplicationContext("org.telran.spring.project");

        //Java Based config
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfiguration.class);
        Book book = (Book) context.getBean("superbook");
        Book bean = context.getBean(Book.class);//Идентична верхней записи
        System.out.println(book);


       Library library = context.getBean(Library.class);
        System.out.println("Library " + library.getName());
    }
}
