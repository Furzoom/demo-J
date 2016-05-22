package com.furzoom.lab;

public class Exam602 {
    public static void main(String[] args) {
        String s = "Welcome to Furzoom.com ";
        StringBuilder sb = new StringBuilder(s);
        int index;
        while ((index = sb.indexOf(" ")) != -1) {
            sb.deleteCharAt(index);
        }
        s = sb.toString();
        System.out.println("s : " + s);
    }
}
