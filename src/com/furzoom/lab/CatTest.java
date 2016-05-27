package com.furzoom.lab;

public class CatTest {
    public static void main(String[] args) {
        Cat cat1 = new Cat("java", 12, 21, Color.BLACK);
        Cat cat2 = new Cat("C++", 12, 21, Color.WHITE);
        Cat cat3 = new Cat("Java", 12, 21, Color.BLACK);

        System.out.println("cat1: " + cat1.hashCode());
        System.out.println("cat2: " + cat2.hashCode());
        System.out.println("cat3: " + cat3.hashCode());
        System.out.println("cat1 == cat2 : " + cat1.equals(cat2));
        System.out.println("cat1 == cat3 : " + cat1.equals(cat3));
    }
}
