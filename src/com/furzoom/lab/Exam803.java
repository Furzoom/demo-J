package com.furzoom.lab;

class Base {
    public Base() {
        System.out.println("Base()");
    }
}

public class Exam803 extends Base{
    public Exam803() {
        super();
        System.out.println("Derived");
    }

    public static void main(String[] args) {
        Exam803 obj = new Exam803();
    }
}

