package com.furzoom.lab.algs.ch101;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class E10131
{
    private static double[][] points;
    public static void drawCircle(int n)
    {
        StdDraw.setXscale(-1.1, 1.1);
        StdDraw.setYscale(-1.1, 1.1);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.circle(0.0, 0.0, 1.0);
        
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.setPenRadius(0.01);
        for (int i = 0; i < n; i++)
        {
            double x = Math.cos((double)i/n * 2 * Math.PI);
            double y = Math.sin((double)i/n * 2 * Math.PI);
            points[i][0] = x;
            points[i][1] = y;
            StdDraw.point(x, y);
        }
    }
    
    public static void randomP(double p)
    {
        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.setPenRadius(0.002);
        for (int i = 0; i < points.length; i++)
        {
            for (int j = 0; j < points.length; j++)
            {
                if (StdRandom.bernoulli(p))
                {
                    StdDraw.line(points[i][0], points[i][1], points[j][0], points[j][1]);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        points = new double[n][2];
        drawCircle(n);
        randomP(0.1);
    }

}
