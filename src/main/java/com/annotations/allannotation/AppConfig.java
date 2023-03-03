package com.annotations.allannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.annotations.allannotation")
public class AppConfig {


    @Bean
    public BookClass getBookclass(){
        return new BookClass();
    }
}
