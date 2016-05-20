package com.furzoom.lab;

import java.util.Scanner;

public class Exam402 {
    public static void main(String[] args) {
        System.out.print("Input a number(3 ~ 20) > ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int halfLength = num / 2;
        for (int i = 0; i <= halfLength; ++i) {
            for (int j = 0; j < halfLength - i; ++j) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = halfLength - 1; i >= 0; --i) {
            for (int j = halfLength - i; j > 0; --j) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}


