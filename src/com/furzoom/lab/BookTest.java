package com.furzoom.lab;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Java", "Furzoom", 108.35);
        System.out.println("Title:  " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price:  " + book.getPrice());
    }
}
