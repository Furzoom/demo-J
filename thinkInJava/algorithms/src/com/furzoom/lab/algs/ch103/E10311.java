/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 20, 2016 1:36:55 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

import java.util.Scanner;

/**
 * ClassName    : E10311 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Oct 20, 2016 1:36:55 PM <br>
 * 
 * @version 
 */
public class E10311
{
    private static int evaluatePostfix(String s)
    {
        String[] params = s.split(" ");
        Stack<Integer> stack = new Stack<Integer>();
        for (String param : params) {
            if (param.equals("+")) {
                int d2 = stack.pop();
                int d1 = stack.pop();
                stack.push(d1 + d2);
            } else if (param.equals("-")) {
                int d2 = stack.pop();
                int d1 = stack.pop();
                stack.push(d1 - d2);
            } else if (param.equals("*")) {
                int d2 = stack.pop();
                int d1 = stack.pop();
                stack.push(d1 * d2);
            } else if (param.equals("/")) {
                int d2 = stack.pop();
                int d1 = stack.pop();
                stack.push(d1 / d2);
            } else { // number
                stack.push(Integer.parseInt(param));
            }
        }
        return stack.pop();
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(evaluatePostfix(scanner.nextLine()));
        }
        scanner.close();
    }
}
