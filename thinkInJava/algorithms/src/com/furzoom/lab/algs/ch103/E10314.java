/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 20, 2016 3:35:46 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

/**
 * ClassName    : E10314 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Oct 20, 2016 3:35:46 PM <br>
 * 
 * @version 
 */
public class E10314
{
    public static void main(String[] args)
    {
        ResizingArrayQueueOfStrings<String> queue = new ResizingArrayQueueOfStrings<String>();
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        queue.enqueue("d");
        queue.enqueue("e");
        queue.enqueue("f");
        queue.enqueue("g");
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue() + " " + queue.size());
        }
    }

}
