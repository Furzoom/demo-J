package com.furzoom.lab;

class Base {
    public void method1() {
        System.out.println("method1 in Base");
    }

    public void method2() {
        System.out.println("method2 in Base");
    }
}

public class Exam802 extends Base {
    public void method2() {
        System.out.println("method2 in Derived");
    }

    public static void main(String[] args) {
        Exam802 obj = new Exam802();
        Base base = (Base)obj;
        base.method2();
    }
}

