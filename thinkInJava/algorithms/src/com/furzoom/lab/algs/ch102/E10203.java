/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Sep 26, 2016 3:26:18 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch102;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.StdRandom;

/**
 * ClassName    : E10203 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Sep 26, 2016 3:26:18 PM <br>
 * 
 * @version 
 */
public class E10203
{
    public static double min(double d1, double d2)
    {
        return d1 < d2 ? d1 : d2;
    }
    
    public static double max(double d1, double d2)
    {
        return d1 > d2 ? d1 : d2;
    }
    
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        double min = Double.parseDouble(args[1]);
        double max = Double.parseDouble(args[2]);
        
        Interval2D[] intervals = new Interval2D[n];
        for (int i = 0; i < n; i++)
        {
            double d1 = StdRandom.uniform(min, max);
            double d2 = StdRandom.uniform(min, max);
            double d3 = StdRandom.uniform(min, max);
            double d4 = StdRandom.uniform(min, max);
   
            intervals[i] = new Interval2D(new Interval1D(min(d1, d2), max(d1, d2)),
                    new Interval1D(min(d3, d4), max(d3, d4)));
        }
        // draw all Interval2D
        for (int i = 0; i < n; i++)
        {
            intervals[i].draw();
        }
        // 
        int countIntersects = 0;
        int countContains = 0;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (intervals[i].intersects(intervals[j]))
                {
                    countIntersects++;
                }
//                if (intervals[i].contains(intervals[j]))
//                {
//                    
//                }
            }
        }
        System.out.println(countIntersects);
        
    }
}
