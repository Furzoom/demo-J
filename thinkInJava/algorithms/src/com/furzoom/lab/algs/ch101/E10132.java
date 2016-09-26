package com.furzoom.lab.algs.ch101;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;

public class E10132
{
    public static void draw(double[] data, double l, double r, int n)
    {
        int[] res = new int[n];
        double dis = (r - l) / n;
        for (int i = 0; i < data.length; i++)
        {
            int k = (int) ((data[i] - l) / dis) - 1; 
            if (k >= 0 && k < n)
                res[k] ++;
        }
        
        int max = max(res);
        StdDraw.setXscale(-0.1 * n, 1.1 * n);
        StdDraw.setYscale(-0.1 * max, 1.1 * max);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.line(0, 0, 0, max * 1.05);
        StdDraw.line(0, 0, n * 1.05, 0);
        
        StdDraw.setPenColor(StdDraw.BLUE);
        for (int i = 0; i <= max; i++)
        {
            StdDraw.text(-0.02 * max, i, i + "");
        }
        
        for (int i = 0; i < n; i++)
        {
            StdDraw.setPenColor(StdDraw.GRAY);
            StdDraw.filledRectangle(i + 0.5, res[i] / 2.0, 0.5, res[i] / 2.0);
            StdDraw.setPenColor(StdDraw.DARK_GRAY);
            StdDraw.rectangle(i + 0.5, res[i] / 2.0, 0.5, res[i] / 2.0);
            StdDraw.setPenColor(StdDraw.BLUE);
            String text = String.format("%.2f", l + dis * i);
            StdDraw.text(i, -0.05 * max, text);
        }
        String text = String.format("%.2f", r);
        StdDraw.text(n, -0.05 * max, text);
        
    }
    public static int max(int[] arr)
    {
        int res = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > arr[res])
                res = i;
        }
        return arr[res];
    }
    
    public static void main(String[] args)
    {
        In in = new In(args[0]);
        double[] data = in.readAllDoubles();
        double l = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);
        int n = Integer.parseInt(args[3]);
        draw(data, l, r, n);
    }

}
