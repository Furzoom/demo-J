package com.furzoom.lab;

import java.util.Date;

public class Exam603 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(String.format("%tc", date));
        System.out.println(String.format("%tY", date) + "-"
                         + String.format("%tm", date) + "-"
                         + String.format("%td", date));
    }
}
