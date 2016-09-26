package com.furzoom.lab.algs.ch101;

public class E10130
{

    public static void fill(boolean[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (gcd(i, j) != 1)
                {
                    arr[i][j] = true; 
                }
            }
        }
    }
    
    public static int gcd(int m, int n)
    {
        if (m == 0 || n == 0)
            return 1;
        if (m % n == 0) 
            return n;
        return gcd(n, m % n);
    }
    
    public static void print(boolean[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (arr[i][j])
                    System.out.print("+ ");
                else 
                    System.out.print("- ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args)
    {
        boolean[][] b = new boolean[20][20];
        fill(b);
        print(b);
    }

}
