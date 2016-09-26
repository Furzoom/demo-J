package com.furzoom.lab.algs.ch101;

public class E10119
{
    private static long[] results = new long[100];
    private static int count;
    public static long F(int n)
    {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return F(n - 1) + F(n - 2);
    }
    
    public static long F1(int n)
    {
        if (n <= count) return results[n];
        
        if (n == 0 || n == 1)
        {
            count = n;
            return results[count] = count;
        }
        results[n] = F1(n - 1) + F1(n - 2);
        count = n;
        return results[n];
        
    }
    public static void main(String[] args)
    {
        for (int n = 0; n < 100; n++)
        {
            System.out.println(n + " " + F1(n));
        }
    }

}
