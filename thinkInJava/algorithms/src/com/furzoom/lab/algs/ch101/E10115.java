package com.furzoom.lab.algs.ch101;

public class E10115
{
    public static int[] histogram(int[] a, int m)
    {
        int[] res = new int[m];
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] < m)
            {
                res[a[i]]++;
            }
        }
        return res;
    }
    
    public static void main(String[] args)
    {
        int[] arr = {0, 1, 0, 3, 4, 2, 3, 1, 2, 3, 4, 2, 5};
        int[] nums = histogram(arr, 6);
        for (int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

}
