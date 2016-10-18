/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Sep 28, 2016 2:25:18 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

import edu.princeton.cs.algs4.StdIn;

/**
 * ClassName    : E10303 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Sep 28, 2016 2:25:18 PM <br>
 * 
 * @version 
 */
public class E10303
{
    public static boolean isValid(int[] seq)
    {
        Stack<Integer> stack = new Stack<Integer>();
        int currentNum = 9;
        int index = 9;
        while (currentNum >= 0)
        {
            if (index >= 0 && seq[index] == currentNum)
            {
                index--;
                currentNum--;
            }
            else if (!stack.isEmpty() && stack.peek() == currentNum)
            {
                stack.pop();
                currentNum--;
            }
            else 
            {
                if (index < 0)
                    break;
                stack.push(seq[index]);
                index--;
            }
        }     
        return stack.isEmpty();
    }
    
    public static void main(String[] args)
    {
        while (!StdIn.isEmpty())
        {
            String line = StdIn.readLine();
            String[] values = line.split("\\s+");
            int[] nums = new int[10];

            for (int i = 0; i < values.length; i++)
            {
                nums[i] = Integer.parseInt(values[i]);
            }

            if (isValid(nums))
            {
                System.out.println("OK");
            } 
            else
            {
                System.out.println("No");
            }
        }
    }

}
