/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Sep 26, 2016 5:04:27 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch102;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

/**
 * ClassName    : E10210 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Sep 26, 2016 5:04:27 PM <br>
 * 
 * @version 
 */
public class E10210
{
    public static void main(String[] args)
    {
        int max = 15;
        int count = 30;
        
        StdDraw.setXscale(0, count+1);
        StdDraw.setYscale(-max, max);
        StdDraw.line(0, 0, count+1, 0);
        
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.setPenRadius(0.005);
        
        VisualCounter counter = new VisualCounter(count, max);
        counter.draw();
        for (int i = 0; i < count; i++)
        {
            if (StdRandom.bernoulli())
            {
                counter.increment();
            }
            else
            {
                counter.decrement();
            }
            counter.draw();
        }
        
    }
}

class VisualCounter
{
    private final int n;
    private final int max;
    private int value;
    private int operationCount;
    
    public VisualCounter(int n, int max)
    {
        this.n = n;
        this.max = max;
        this.value = 0;
        this.operationCount = 0;
    }
    
    public void increment()
    {
        if (operationCount++ < n && value < max)
        {
            value++;
        }
    }
    
    public void decrement()
    {
        if (operationCount++ < n && value > -max)
        {
            value--;
        }
    }
    
    public void draw()
    {
        StdDraw.point(operationCount, value);
    }
}