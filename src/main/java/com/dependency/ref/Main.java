package com.dependency.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("dependency.xml");

        DemoClass2 demoClass2=(DemoClass2) context.getBean("DemoClass2");

        System.out.println("Sum of num1 and num2="+demoClass2.getSum());


        System.out.println(demoClass2.getDemoClass1().num1);
        System.out.println(demoClass2);
    }


}
