/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Sep 26, 2016 4:49:49 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch102;

import java.util.Arrays;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.In;

/**
 * ClassName    : E10209 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Sep 26, 2016 4:49:49 PM <br>
 * 
 * @version 
 */
public class E10209
{
    public static int rank(int key, int[] a, Counter counter)
    {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi)
        {
            counter.increment();
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
    
    public static void main(String[] args)
    {
        In in = new In(args[0]);
        int key = Integer.parseInt(args[1]);
        int[] whitelist = in.readAllInts();
        Counter c = new Counter("binary search");
        
        Arrays.sort(whitelist);
        rank(key, whitelist, c);
        System.out.println(c);
    }

}
