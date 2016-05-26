package com.furzoom.lab;

public class SellOutClass {
    private String name;
    public SellOutClass() {
        name = "apple";
    }

    public void sell(int price) {
        class Apple {
            int innerPrice = 0;
            public Apple(int price) {
                this.innerPrice = price;
            }
            public void price() {
                System.out.println("Now selling: " + name);
                System.out.println("$" + innerPrice);
            }
        }
        Apple apple = new Apple(price);
        apple.price();
    }
    public static void main(String[] args) {
        SellOutClass sample = new SellOutClass();
        sample.sell(100);
    }
}

