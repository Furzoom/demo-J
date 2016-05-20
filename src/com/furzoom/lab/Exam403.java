package com.furzoom.lab;

public class Exam403 {
    public static void main(String[] args) {
        double result = 0;
        int i = 1;
        int temp = 1;
        while (i <= 20) {
            temp *= i;
            result += (double)1 / temp;
            ++i;
        }
        System.out.println("1 + 1/2! + ... + 1/20! = " + result); 
    }
}
