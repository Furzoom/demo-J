package com.furzoom.lab;

public class Exam601 {
    private final static String S = "welcome to Furzoom.com";
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < S.length(); ++i) {
            if (S.charAt(i) == 'o') {
                count ++;
            }
        }
        System.out.println("count 'o' in " + S + " : " + count);
    }
}
