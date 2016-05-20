package com.furzoom.lab;

public class Exam503 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,3}, {2,4,5},{10}};
        int sum = 0;
        for (int[] a : arr) {
            for (int x : a) {
                sum += x;
            }
        }
        System.out.println("sum : " + sum);
    }
}
