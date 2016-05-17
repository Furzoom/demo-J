package com.furzoom.lab;

import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a year> ");
        long year = scan.nextLong();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is NOT a leap year");
        }
    }
}
