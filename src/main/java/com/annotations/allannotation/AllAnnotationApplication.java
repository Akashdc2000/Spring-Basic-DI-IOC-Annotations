package com.annotations.allannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AllAnnotationApplication implements CommandLineRunner {

    @Autowired
    private BookClass book;

//    ApplicationContext factory = new AnnotationConfigApplicationContext(MyConfigrations.class);

//    BookClass bookClass = factory.getBean(BookClass.class);
    public static void main(String[] args) {
        SpringApplication.run(AllAnnotationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        book.getBookDetails();
        System.out.println("called");
    }
}
