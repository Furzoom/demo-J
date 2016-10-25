/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 25, 2016 11:38:20 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

import java.util.Iterator;

/**
 * ClassName    : E10329 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Oct 25, 2016 11:38:20 AM <br>
 * 
 * @version 
 */
public class E10329
{
    public static void main(String[] args)
    {
        CircleQueue<String> queue = new CircleQueue<String>();
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        queue.enqueue("d");
        queue.enqueue("e");
        
        Iterator<?> it = queue.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("dequeue: ");
        String s;
        while ((s = queue.dequeue()) != null)
        {
            System.out.println(s);
        }
    }
    
}
