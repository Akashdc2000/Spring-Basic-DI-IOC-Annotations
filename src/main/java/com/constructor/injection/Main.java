package com.constructor.injection;

import com.dependency.ref.DemoClass2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {


    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("constructorInjection.xml");

        ConstructorInjection constructorInjection=(ConstructorInjection)  context.getBean("constructorInjection");
        System.out.println(constructorInjection);
    }


}
