/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Sep 28, 2016 4:20:38 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

/**
 * ClassName    : E10306 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Sep 28, 2016 4:20:38 PM <br>
 * 
 * @version 
 */
public class E10306
{
    public static void test(Queue<String> q)
    {
        Stack<String> stack = new Stack<String>();
        while (!q.isEmpty())
            stack.push(q.dequeue());
        while (!stack.isEmpty())
            q.enqueue(stack.pop());
    }
    
    public static void main(String[] args)
    {
        Queue<String> q = new Queue<String>();
        q.enqueue("a");
        q.enqueue("b");
        q.enqueue("c");
        q.enqueue("d");
        
        for (String s : q)
            System.out.print(s + " ");
        System.out.println();
        
        test(q);
        
        for (String s : q)
            System.out.print(s + " ");
        System.out.println();
        
    }

}
