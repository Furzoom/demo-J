/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Sep 26, 2016 10:50:43 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs;

/**
 * ClassName    : Date <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Sep 26, 2016 10:50:43 AM <br>
 * 
 * @version 
 */
public class Date
{
    private final int month;
    private final int day;
    private final int year;
    
    public Date(int m, int d, int y)
    {
        month = m;
        day = d;
        year = y;
    }
    
    public int month()
    {
        return month;
    }
    
    public int day()
    {
        return day;
    }
    
    public int year()
    {
        return year;
    }
    
    public String toString()
    {
        return month() + "/" + day() + "/" + year();
    }
    
    public boolean equals(Object x)
    {
        if (this == x) return true;
        if (x == null) return false;
        if (this.getClass() != x.getClass()) return false;
        Date that = (Date)x;
        if (this.day != that.day) return false; 
        if (this.month != that.month) return false;
        if (this.year != that.year) return false; 
        return true;
    }
}
