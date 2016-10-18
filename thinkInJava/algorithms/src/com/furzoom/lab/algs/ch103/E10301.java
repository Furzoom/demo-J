/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Sep 28, 2016 11:26:45 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

import edu.princeton.cs.algs4.StdIn;

/**
 * ClassName    : E10301 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Sep 28, 2016 11:26:45 AM <br>
 * 
 * @version 
 */
public class E10301
{
    public static void main(String[] args)
    {
        FixedCapacityStackOfStrings s;
        s = new FixedCapacityStackOfStrings(3);
        while (!StdIn.isEmpty())
        {
            String item = StdIn.readString();
            if (s.isFull())
            {
                System.out.println("Stack is full.");
                break;
            }
            s.push(item);
        }
    }

}
