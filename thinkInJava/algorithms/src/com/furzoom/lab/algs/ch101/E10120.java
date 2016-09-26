package com.furzoom.lab.algs.ch101;

public class E10120
{
    public static double factorialLn(int n)
    {
        if (n <= 1) return 0;
        return Math.log(n) + factorialLn(n - 1);
    }
    
    public static void main(String[] args)
    {
        for (int i = 1; i <= 30; i++)
        {
            System.out.println(i + " " + factorialLn(i));
        }
    }
}
