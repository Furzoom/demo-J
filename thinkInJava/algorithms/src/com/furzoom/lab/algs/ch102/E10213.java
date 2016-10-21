/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Sep 27, 2016 11:09:47 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch102;

import java.util.Arrays;

/**
 * ClassName    : E10213 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Sep 27, 2016 11:09:47 AM <br>
 * 
 * @version 
 */
public class E10213
{
    public static void main(String[] args)
    {
        Transaction[] t = new Transaction[4];
        t[0] = new Transaction("Turing 6/17/1990 644.08");
        t[1] = new Transaction("Tarjan 3/26/2002 4121.85");
        t[2] = new Transaction("Knuth 6/14/1999 288.34");
        t[3] = new Transaction("Dijkstra 8/22/2007 2678.40");
        
        System.out.println("Unsorted:");
        for (int i = 0; i < t.length; i++)
        {
            System.out.println(t[i]);
        }
        System.out.println();
        
        System.out.println("Sorted:");
        Arrays.sort(t);
        for (int i = 0; i < t.length; i++)
        {
            System.out.println(t[i]);
        }
        System.out.println();
        
    }

}