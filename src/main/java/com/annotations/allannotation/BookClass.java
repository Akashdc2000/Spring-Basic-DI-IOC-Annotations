package com.annotations.allannotation;

import org.springframework.stereotype.Component;

@Component
public class BookClass {

    public void getBookDetails(){
        System.out.println("Book Method Called Successfully....");
    }
}
