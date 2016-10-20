/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 20, 2016 5:33:14 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

import com.furzoom.lab.algs.Date;

/**
 * ClassName    : E10316 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Oct 20, 2016 5:33:14 PM <br>
 * 
 * @version 
 */
public class E10316
{
    public static void main(String[] args)
    {
        String s = "11/30/2009 1/12/2012";
        Date[] dates = Date.readDates(s);
        for (int i = 0; i < dates.length; i++) {
            System.out.println(dates[i]);
        }
    }
}
