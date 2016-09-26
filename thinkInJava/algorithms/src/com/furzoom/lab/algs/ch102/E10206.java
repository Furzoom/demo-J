/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Sep 26, 2016 4:10:18 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch102;

/**
 * ClassName    : E10206 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Sep 26, 2016 4:10:18 PM <br>
 * 
 * @version 
 */
public class E10206
{
    public static void main(String[] args)
    {
        String s = args[0];
        String t = args[1];
        if (s.length() == t.length() && s.concat(s).indexOf(t) != -1)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }

}
