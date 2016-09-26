/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Sep 26, 2016 2:14:59 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch102;

import java.util.Arrays;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;

/**
 * ClassName    : E10202 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Sep 26, 2016 2:14:59 PM <br>
 * 
 * @version 
 */
public class E10202
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        Interval1D[] intervals = new Interval1D[n];
        for (int i = 0; i < n; i++)
        {
            double d1 = StdIn.readDouble();
            double d2 = StdIn.readDouble();
            intervals[i] = new Interval1D(d1, d2);
        }
        Arrays.sort(intervals, Interval1D.MIN_ENDPOINT_ORDER);
        for (int i = 0; i < n; i++)
        {
            Interval1D interval = intervals[i];
            for (int j = 0; j < n; j++)
            {
                if (j != i && interval.intersects(intervals[j]))
                {
                    System.out.println(interval);
                    break;
                }
            }
        }
    }
}
