package com.furzoom.lab;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] day;
        int[] month = new int[12];
        int year[];
        day = new int[31];
        year = new int[]{1, 5};
        int arr[] = new int[]{1, 2, 3, 4, 5};
        int arr2[] = {5, 4, 3};

        System.out.println("LENGTH");
        System.out.println("\tday\t: " + day.length);
        System.out.println("\tmonth\t: " + month.length);
        System.out.println("\tyear\t: " + year.length);
        System.out.println("\tarr\t: " + arr.length);
        System.out.println("\tarr2\t: " + arr2.length);

        int arr3[][];
        arr3 = new int[2][4];
        int arr4[][];
        arr4 = new int[2][];
        arr4[0] = new int[2];
        arr4[1] = new int[3];
        int arr5[][] = {{12, 0}, {45, 15, 1}};
        System.out.println("\n\nLENGTH");
        System.out.println("\tarr3\t: " + arr3.length);
        System.out.println("\t\tarr3[0]\t: " + arr3[0].length);
        System.out.println("\t\tarr3[1]\t: " + arr3[1].length);
        System.out.println("\tarr4\t: " + arr4.length);
        System.out.println("\t\tarr4[0]\t: " + arr4[0].length);
        System.out.println("\t\tarr4[1]\t: " + arr4[1].length);
        System.out.println("\tarr5\t: " + arr5.length);
        System.out.println("\t\tarr5[0]\t: " + arr5[0].length);
        System.out.println("\t\tarr5[1]\t: " + arr5[1].length);
        System.out.println("\t\tarr5: ");
        for (int[] i : arr5) {
            System.out.print("\t\t\t");
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nfill");
        Arrays.fill(month, 1);
        displayArray(month);
        Arrays.fill(month, 3, 10, 7);
        displayArray(month);
        Arrays.sort(month);
        displayArray(month);

        System.out.println("\ncopyOf");
        int[] arr6 = Arrays.copyOf(month, 6);
        displayArray(arr6);
        displayArray(Arrays.copyOf(month, 14));
    }

    private static void displayArray(int[] arr) {
        System.out.print("\t\t");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
