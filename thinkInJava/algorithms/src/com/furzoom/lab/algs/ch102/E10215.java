/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Sep 27, 2016 2:07:53 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch102;

import edu.princeton.cs.algs4.In;

/**
 * ClassName    : E10215 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Sep 27, 2016 2:07:53 PM <br>
 * 
 * @version 
 */
public class E10215
{
    public static int[] readInts(String name)
    {
        In in = new In(name);
        String input = in.readAll();
        String[] words = input.split("\\s+");
        int[] ints = new int[words.length];
        for (int i = 0; i < words.length; i++)
        {
            ints[i] = Integer.parseInt(words[i]);
        }
        return ints;
    }
    
    public static void main(String[] args)
    {
        int[] data = readInts(args[0]);
        for (int i = 0; i < data.length; i++)
        {
            System.out.println(data[i]);
        }
    }

}
