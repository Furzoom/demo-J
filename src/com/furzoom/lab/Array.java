package com.furzoom.lab;

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

    }
}
