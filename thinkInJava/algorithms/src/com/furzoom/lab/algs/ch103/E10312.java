/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 20, 2016 2:41:24 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

/**
 * ClassName    : E10312 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Oct 20, 2016 2:41:24 PM <br>
 * 
 * @version 
 */
public class E10312
{
    public static void main(String[] args) {
        Stack<String> s1 = new Stack<String>();
        s1.push("first");
        s1.push("second");
        s1.push("third");
        
        Stack<String> s2 = Stack.copy(s1);
        while (!s2.isEmpty()) {
            System.out.println(s2.pop());
        }
    }
}
