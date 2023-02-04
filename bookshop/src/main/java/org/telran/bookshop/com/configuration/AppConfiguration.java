package org.telran.bookshop.com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.telran.bookshop.com.controller.AppController;

@Configuration
@ComponentScan("org.telran.bookshop.com.service")
public class AppConfiguration {

    @Bean
    public AppController appController() {
        return new AppController();
    }


}
