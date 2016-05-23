package com.furzoom.lab;

public class Exam702 {
    private double width;
    private double height;

    public Exam702(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Exam702 obj = new Exam702(10.0, 20.0);
        System.out.println("Area: " + obj.getArea());
    }
}
