package org.telran.bookshop.com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.telran.bookshop.com.configuration.AppConfiguration;
import org.telran.bookshop.com.controller.AppController;

public class App {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context
//                = new AnnotationConfigApplicationContext(AppConfiguration.class);
//
//        AppController controller = context.getBean(AppController.class);
//        controller.start();

        AppController controller = new AppController;

    }
}
