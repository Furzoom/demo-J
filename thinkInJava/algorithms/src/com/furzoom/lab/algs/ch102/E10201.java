/**
 * Description : E10201
 * Author      : mn@furzoom.com
 * Date        : Sep 26, 2016 11:09:05 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch102;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Point2D;

/**
 * ClassName    : E10201 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Sep 26, 2016 11:09:05 AM <br>
 * 
 * @version 
 */
public class E10201
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        Point2D[] points = new Point2D[n];
        for (int i = 0; i < n; i++)
        {
            points[i] = new Point2D(StdRandom.uniform(), StdRandom.uniform());
        }
        StdDraw.setPenColor(StdDraw.BLUE);
        Arrays.sort(points);
        for (int i = 0; i < n; i++)
        {
            points[i].draw();
            System.out.println(points[i]);
        }
        double minDistance = (points[0].x() - points[n-1].x()) * (points[0].x() - points[n-1].x()) 
                + (points[0].y() - points[n-1].y()) * (points[0].y() - points[n-1].y());
        int minIndex = n;
        for (int i = 0; i < n - 1; i ++)
        {
            double dis = (points[i].x() - points[i+1].x()) * (points[i].x() - points[i+1].x())
                    + (points[i].y() - points[i+1].y()) * (points[i].y() - points[i+1].y());
            if (minDistance > dis)
            {
                minDistance = dis;
                minIndex = i;
            }
        }
        System.out.println(Math.sqrt(minDistance));
        StdDraw.setPenColor(StdDraw.RED);
        if (minIndex == n)
        {
            System.out.println(points[0]);
            System.out.println(points[n-1]);
            StdDraw.line(points[n-1].x(), points[n-1].y(), points[0].x(), points[0].y());
        }
        else
        {
            System.out.println(points[minIndex]);
            System.out.println(points[minIndex + 1]);
            StdDraw.line(points[minIndex].x(), points[minIndex].y(), 
                    points[minIndex+1].x(), points[minIndex+1].y());
            
        }
        
    }

}
