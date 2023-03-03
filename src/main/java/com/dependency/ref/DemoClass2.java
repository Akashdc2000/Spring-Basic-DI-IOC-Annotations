package com.dependency.ref;


public class DemoClass2 {

    int num2;
    int sum;

    DemoClass1 demoClass1;
    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int num1) {
        this.sum = getNum2()+num1;
    }
    public void myFunction1(){
        System.out.println("This is a Function of ClassDemo2=>myFunction1()");
    }
    public void myFunction2(){
        System.out.println("This is a Function of ClassDemo2=>myFunction2()");
    }

    public DemoClass1 getDemoClass1() {
        return demoClass1;
    }

    public void setDemoClass1(DemoClass1 demoClass1) {
        this.demoClass1 = demoClass1;
    }

    @Override
    public String toString() {
        return "DemoClass2{" +
                "num2=" + num2 +
                ", sum=" + sum +
                ", demoClass1=" + demoClass1 +
                '}';
    }
}
