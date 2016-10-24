/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 24, 2016 4:13:20 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

/**
 * ClassName    : E10319 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Oct 24, 2016 4:13:20 PM <br>
 * 
 * @version 
 */
public class E10319
{
    private class Node 
    {
        int item;
        Node next;
    }
    
    private Node first;
    
    public void deleteLastNode()
    {
        Node current = first;
        if (current == null) return;
        
        Node next = current.next;
        if (next == null) first = null;
        
        while (next.next != null)
        {
            current = next;
            next = next.next;
        }
        current.next = null;
    }
}
