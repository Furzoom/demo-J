/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Sep 29, 2016 9:04:11 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

/**
 * ClassName    : E10307 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Sep 29, 2016 9:04:11 AM <br>
 * 
 * @version 
 */
public class E10307
{
    public static void main(String[] args)
    {
        Stack<String> s = new Stack<String>();
        
        s.push("Welcome");
        s.push("to");
        s.push("furzoom.com");
        
        System.out.println(s.peek());
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        System.out.println(s.peek());
    }

}
