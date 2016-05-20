package com.furzoom.lab;

public class ArrayMemory2 {
    public static void main(String[] args) {
        int size = 1024 * 1024;
        long memory = Runtime.getRuntime().totalMemory() / size;
        System.out.println("Memory size: " + memory + "M");
        int[][] arr = new int[size][2];
        for (int i = 0; i < arr.length; ++i) {
            arr[i][0] = i;
            arr[i][1] = i;
        }

        memory = Runtime.getRuntime().totalMemory() / size;
        System.out.println("Memory size: " + memory + "M");
    }
}
