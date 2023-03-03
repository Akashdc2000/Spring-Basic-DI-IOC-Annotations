package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        //Tight Coupled Objects
        Student s1=new Student(1,"Akash",20);
        System.out.println("Tightly Coupled Object...");
        System.out.println(s1);

        //Loosely Coupled Objects
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        System.out.println("Loosely Coupled Object...");
        Student s2=(Student) context.getBean("student1");
        Student s3=(Student) context.getBean("student2");

        System.out.println(s2);
        System.out.println(s3);
    }
}
