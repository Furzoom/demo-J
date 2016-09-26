package com.furzoom.lab.algs.ch101;

public class E10114
{

    public static int lg(int n)
    {
        int result = 1;
        int i = 0;
        while (result <= n)
        {
            result <<= 1;
            i++;
        }
        return --i;
    }
    
    public static void main(String[] args)
    {
        System.out.println(lg(1));
        System.out.println(lg(2));
        System.out.println(lg(3));
        System.out.println(lg(13));
        System.out.println(lg(17));
    }

}
