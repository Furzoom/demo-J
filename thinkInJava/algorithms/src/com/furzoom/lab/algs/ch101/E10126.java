package com.furzoom.lab.algs.ch101;

public class E10126
{

    public static void sort3(int a, int b, int c)
    {
        int t = 0;
        if (a > b)
        {
            t = a;
            a = b;
            b = t;
        }
        if (a > c)
        {
            t = a;
            a = c;
            c = t;
        }
        if (b > c)
        {
            t = b;
            b = c;
            c = t;
        }
        System.out.printf("%d < %d < %d\n", a, b, c);
    }
    
    public static void main(String[] args)
    {
        sort3(1, 2, 3);
        sort3(1, 3, 2);
        sort3(2, 1, 3);
        sort3(2, 3, 1);
        sort3(3, 1, 2);
        sort3(3, 2, 1);
    }

}
