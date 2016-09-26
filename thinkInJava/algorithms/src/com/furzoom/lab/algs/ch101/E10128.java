package com.furzoom.lab.algs.ch101;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class E10128
{
    public static int rank(int key, int[] a)
    {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid])
            {
                hi = mid - 1;
            }
            else if (key > a[mid])
            {
                lo = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    
    private static int count(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] == arr[i+1])
                sum++;
        }
        return sum;
    }
    
    public static int[] unique(int[] arr)
    {
        int[] res = new int[arr.length - count(arr)];
        int s = 0;
        res[0] = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (res[s] != arr[i])
            {
                res[++s] = arr[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        Arrays.sort(whitelist);
        int[] res = unique(whitelist);
        for (int i = 0; i < res.length; i++)
            System.out.println(res[i]);
        /*
        while (!StdIn.isEmpty())
        {
            int key = StdIn.readInt();
            StdOut.println(rank(key, whitelist));
        }
        */
    }

}
