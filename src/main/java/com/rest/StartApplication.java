package com.rest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.rest.dao.BookRepository;
import com.rest.model.Book;

import java.math.BigDecimal;

@SpringBootApplication
public class StartApplication {

    // start everything
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

    @Profile("demo")
    @Bean
    CommandLineRunner initDatabase(BookRepository repository) {
        return args -> {
            repository.save(new Book("Test Book1", "Santide", new BigDecimal("15.41")));
            repository.save(new Book("Test Book2", "Marie", new BigDecimal("9.69")));
            repository.save(new Book("Test Book3", "Fowler", new BigDecimal("47.99")));
        };
    }
}