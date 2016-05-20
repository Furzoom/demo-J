package com.furzoom.lab;

public class Exam502 {
    public static void main(String[] args) {
        int[] arr = new int[]{20, 50, 30, 80, 90, 60};
        int max;
        max = arr[0];
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println("max: " + max);
    }
}

