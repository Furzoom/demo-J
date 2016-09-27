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
    private double m;
    private double s;
    private int n;
    
    public void addDataValue(double val)
    {
        n++;
        s = s + 1.0 * (n - 1) / n * (val - m) * (val - m);
        m = m + (val - m) / n;
    }
    
    public double mean()
    {
        return m;
    }
    
    public double var()
    {
        return s / (n - 1);
    }
    
    public double stddev()
    {
        return Math.sqrt(this.var());
    }
    
    public String toString()
    {
        return String.format("%.5f %.5f", mean(), stddev());
    }
}
