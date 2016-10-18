/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Sep 28, 2016 11:23:52 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

/**
 * ClassName    : FixedCapacityStackOfStrings <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Sep 28, 2016 11:23:52 AM <br>
 * 
 * @version 
 */
public class FixedCapacityStackOfStrings
{
    private String[] a; // stack entries
    private int n;      // size;
    public FixedCapacityStackOfStrings(int cap)
    {
        a = new String[cap];
    }
    
    public boolean isEmpty() 
    {
        return n == 0;
    }
    
    public int size()
    {
        return n;
    }
    
    public void push(String item)
    {
        a[n++] = item;
    }
    
    public String pop()
    {
        return a[--n];
    }
    
    public boolean isFull()
    {
        return n == a.length;
    }
    
    public static void main(String[] args)
    {
        
    }

}
