/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Sep 26, 2016 5:40:07 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch102;

import com.furzoom.lab.algs.SmartDate;

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
        @SuppressWarnings("unused")
        SmartDate date;
        try {
            date = new SmartDate(13, 1, 1999);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        
        try {
            date = new SmartDate(2, 29, 2000);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
         
        try {
            date = new SmartDate(2, 29, 1900);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
         
        try {
            date = new SmartDate(2, 28, 2002);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
         
        try {
            date = new SmartDate(4, 31, 2000);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        
        try {
            date = new SmartDate(5, 31, 2000);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
