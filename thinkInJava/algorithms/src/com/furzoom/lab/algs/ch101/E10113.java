package com.furzoom.lab.algs.ch101;

public class E10113
{
    public static int[][] reverse(int[][] arr)
    {
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; ++j)
            {
                result[j][i] = arr[i][j];
            }
        }
        return result;
    }
    
    public static void print(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args)
    {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        print(arr);
        System.out.println();
        print(reverse(arr));
    }

}
