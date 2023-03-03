package com.constructor.injection;

public class ConstructorInjection {
    private String name;
    private int id;
    private int age;
    public ConstructorInjection(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public ConstructorInjection() {
    }

    @Override
    public String toString() {
        return "ConstructorInjection{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
