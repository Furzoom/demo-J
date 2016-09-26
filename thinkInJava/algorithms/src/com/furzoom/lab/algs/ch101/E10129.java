package com.furzoom.lab.algs.ch101;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;

public class E10129
{
    public static int rank(int key, int[] a)
    {
        int i;
        for (i = 0; i < a.length; i++)
        {
            if (a[i] >= key) break;
        }
        return i;
    }
    
    public static int count(int key, int[] a)
    {
        int c = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] == key) c++;
        }
        return c;
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] arr = in.readAllInts();
        Arrays.sort(arr);
        int key = Integer.parseInt(args[1]);
        System.out.println(rank(key, arr));
        System.out.println(count(key, arr));
    }
}
