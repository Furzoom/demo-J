/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Sep 26, 2016 10:35:26 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs;

/**
 * ClassName    : Accumulator <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Sep 26, 2016 10:35:26 AM <br>
 * 
 * @version 
 */
public class Accumulator
{
    private double total;
    private int n;
    
    public void addDataValue(double val)
    {
        n++;
        total += val;
    }
    
    public double mean()
    {
        return  total / n;
    }
    
    public String toString()
    {
        return "Mean (" + n + " values): " + String.format("%7.5f", mean());
    }
}
