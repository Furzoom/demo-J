/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Sep 29, 2016 9:31:46 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

import edu.princeton.cs.algs4.StdIn;

/**
 * ClassName    : E10308 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Sep 29, 2016 9:31:46 AM <br>
 * 
 * @version 
 */
public class E10308
{
    public static void main(String[] args)
    {
        DoublingStackOfStrings<String> stack = new DoublingStackOfStrings<String>();
        String[] inputs = StdIn.readAllStrings();
        for (int i = 0; i < inputs.length; i++)
        {
            if (inputs[i].equals("-"))
            {
                stack.pop();
            }
            else
            {
                stack.push(inputs[i]);
            }
            for (String s : stack)
            {
                System.out.print(s + " ");
            }
            System.out.println();
            System.out.println("ArraySize: " + stack.arraySize());
            System.out.println();
        }
    }
}
