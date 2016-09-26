/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Sep 26, 2016 5:40:07 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch102;

/**
 * ClassName    : E10211 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Sep 26, 2016 5:40:07 PM <br>
 * 
 * @version 
 */
public class E10211
{
    public static void main(String[] args)
    {
        SmartDate date = new SmartDate(13, 1, 1999);
    }
}

class SmartDate
{
    private final int month;
    private final int day;
    private final int year;
    
    public SmartDate(int m, int d, int y)
    {
        if (!validate(m, d, y))
            throw new IllegalArgumentException("Argument illegal");
        this.month = m;
        this.day = d;
        this.year = y;
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
        return month + "/" + day + "/" + year;
    }
    
    private boolean validate(int m, int d, int y)
    {
        if (year == 0 || year < -1000 || year > 10000)
            return false;
        if (m < 1 || m > 12)
            return false;
        if (day < 1 || day > 31)
            return false;
        int[] months = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (d > months[m])
            return false;
        if (!(year % 400 == 0 || (year % 4 ==  0 &&year % 100 != 0)))
        {
            if (d > 28)
                return false;
        }
        return true;
    }
}
