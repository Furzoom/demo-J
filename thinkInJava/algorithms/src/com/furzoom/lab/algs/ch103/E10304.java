/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Sep 28, 2016 3:43:48 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

import edu.princeton.cs.algs4.StdIn;

/**
 * ClassName    : E10304 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Sep 28, 2016 3:43:48 PM <br>
 * 
 * @version 
 */
public class E10304
{
    public static boolean isValid(String input)
    {
        Stack<Character> s = new Stack<Character>();
        int i;
        for (i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[')
            {
                s.push(ch);
            }
            else if (s.isEmpty())
            {
                break;
            }
            else if (ch == '}')
            {
                if ('{' != s.pop())
                    break;
            }
            else if (ch == ')')
            {
                if ('(' != s.pop())
                    break;
            }
            else if (ch == ']')
            {
                if ('[' != s.pop())
                    break;
            }
            else
            {
                // other character
            }
        }
        return (i == input.length() && s.isEmpty());
    }
    
    public static void main(String[] args)
    {
        while (!StdIn.isEmpty())
        {
            String input = StdIn.readString();
            if (isValid(input))
            {
                System.out.println("OK");
            }
            else
            {
                System.out.println("Invalid");
            }
        }
    }

}
