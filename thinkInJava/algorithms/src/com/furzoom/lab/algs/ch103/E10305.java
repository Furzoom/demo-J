/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Sep 28, 2016 4:12:17 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

/**
 * ClassName    : E10305 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Sep 28, 2016 4:12:17 PM <br>
 * 
 * @version 
 */
public class E10305
{
    public static void main(String[] args)
    {
        int n = 50;
        Stack<Integer> stack = new Stack<Integer>();
        while (n > 0)
        {
            stack.push(n % 2);
            n = n / 2;
        }
        for (int d : stack)
        {
            System.out.print(d);
        }
        System.out.println();
    }

}
