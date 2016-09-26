package com.furzoom.lab.algs.ch101;

public class E10117
{

    public static String exR2(int n)
    {
        String s = exR2(n-3) + n + exR2(n-2) + n;
        if (n <= 0) return "";
        return s;
    }
    
    public static void main(String[] args)
    {
        // StackOverflowError
        //exR2(6);
    }
}
