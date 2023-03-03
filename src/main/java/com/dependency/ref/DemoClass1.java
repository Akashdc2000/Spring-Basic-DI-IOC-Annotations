package com.dependency.ref;

public class DemoClass1 {
    int num1;
    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    @Override
    public String toString() {
        return "DemoClass1{" +
                "num1=" + num1 +
                '}';
    }

    public void myFunction1(){
        System.out.println("This is a Function of ClassDemo1=>myFunction1()");
    }
    public void myFunction2(){
        System.out.println("This is a Function of ClassDemo1=>myFunction2()");
    }
}
