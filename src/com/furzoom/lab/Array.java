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

        System.out.println("\nArrays.fill");
        Arrays.fill(month, 1);
        displayArray(month);
        Arrays.fill(month, 3, 12, 7);
        displayArray(month);
        Arrays.sort(month);
        displayArray(month);

        System.out.println("\nArrays.copyOf");
        displayArray(Arrays.copyOf(month, 6));
        displayArray(Arrays.copyOf(month, 14));

        System.out.println("\nArrays.copyOfRange");
        displayArray(Arrays.copyOfRange(month, 1, 5));
        displayArray(Arrays.copyOfRange(month, 1, 14));

        int[] arr6 = new int[]{20, 40, 90, 30, 80, 50, 70};
        
        System.out.println("\nInsert sort\n\tBefore sort");
        displayArray(arr6);
        int temp;
        int j;
        for (int i = 1; i < arr6.length; ++i) {
            temp = arr6[i];
            for (j = i - 1; j >= 0 && arr6[j] > temp; --j) {
                arr6[j + 1] = arr6[j];
            }
            arr6[j + 1] = temp;
        }
        System.out.println("\tAfter sort");
        displayArray(arr6);

        int[] arr7 = new int[]{20, 40, 90, 30, 80, 50, 70};
        System.out.println("\nBubble Sort\n\tBefore sort");
        displayArray(arr7);
        for (int i = arr7.length - 1; i > 0; --i) {
            for (j = 0; j < i; ++j) {
                if (arr7[j] > arr7[j + 1]) {
                    temp = arr7[j];
                    arr7[j] = arr7[j + 1];
                    arr7[j + 1] = temp;
                }
            }
        }
        System.out.println("\tAfter sort");
        displayArray(arr7);
    }

    private static void displayArray(int[] arr) {
        System.out.print("\t\t");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
