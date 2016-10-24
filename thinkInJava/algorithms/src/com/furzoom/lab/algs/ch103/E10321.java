/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 24, 2016 5:48:11 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

import java.util.Iterator;

/**
 * ClassName    : E10321 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Oct 24, 2016 5:48:11 PM <br>
 * 
 * @version 
 */
public class E10321
{
    public static boolean find(LinkList<String> l, String key)
    {
        Iterator<String> it = l.iterator();
        while (it.hasNext())
        {
            if (key.equals(it.next()))
            {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        LinkList<String> ll = new LinkList<String>();
        ll.append("a");
        ll.append("B");
        ll.append("c");
        ll.append("D");
        ll.append("e");
        
        System.out.println("find\"a\": " + find(ll, "a"));
        System.out.println("find\"B\": " + find(ll, "B"));
        System.out.println("find\"c\": " + find(ll, "c"));
        System.out.println("find\"F\": " + find(ll, "F"));
    }
}
