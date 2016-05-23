package com.furzoom.lab;

public class Exam701 {
    private String name = "private";

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Exam701 obj = new Exam701();
        System.out.println(obj.getName());
        obj.setName("furzoom");
        System.out.println(obj.getName());
    }
}
