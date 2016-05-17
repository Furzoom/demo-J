package com.furzoom.lab;

import java.util.Scanner;

public class Exam302 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input 2 numbers >");
        long numA = scan.nextLong();
        long numB = scan.nextLong();

        System.out.println(numA == numB ? "Equals" : (numA > numB ? numA : numB));
    }
}

