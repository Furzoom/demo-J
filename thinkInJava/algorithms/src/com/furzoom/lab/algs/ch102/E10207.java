/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Sep 26, 2016 4:24:34 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch102;

/**
 * ClassName    : E10207 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Sep 26, 2016 4:24:34 PM <br>
 * 
 * @version 
 */
public class E10207
{
    public static String mystery(String s)
    {
        int n = s.length();
        if (n <= 1) return s;
        String a = s.substring(0, n/2);
        String b = s.substring(n/2, n);
        return mystery(b) + mystery(a);
    }
    
    public static void main(String[] args)
    {
        System.out.println(mystery("mn"));
        System.out.println(mystery("furzoom"));
    }

}
