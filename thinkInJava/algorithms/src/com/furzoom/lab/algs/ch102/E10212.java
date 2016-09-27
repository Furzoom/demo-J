/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Sep 27, 2016 9:42:39 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch102;

/**
 * ClassName    : E10212 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Sep 27, 2016 9:42:39 AM <br>
 * 
 * @version 
 */
public class E10212
{
    public static void main(String[] args)
    {
        SmartDate date = new SmartDate(1, 1, 2000);
        System.out.println(date + " " + date.dayOfTheWeek());
        
        date = new SmartDate(2, 1, 2000);
        System.out.println(date + " " + date.dayOfTheWeek());
        
        date = new SmartDate(12, 29, 2000);
        System.out.println(date + " " + date.dayOfTheWeek());
        
        date = new SmartDate(12, 29, 2010);
        System.out.println(date + " " + date.dayOfTheWeek());
        
        date = new SmartDate("2/3/2005");
        System.out.println(date + " " + date.dayOfTheWeek());
    }

}
