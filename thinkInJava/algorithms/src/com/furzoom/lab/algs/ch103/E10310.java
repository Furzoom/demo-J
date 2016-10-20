/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 20, 2016 10:41:49 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

import java.util.Scanner;

/**
 * ClassName    : E10310 <br>
 * Function     : InfixToPostfix <br>
 * date         : Oct 20, 2016 10:41:49 AM <br>
 * 
 * @version 
 */

public class E10310
{
    private static void infixToPostfix(String exp)
    {
        String[] params = exp.split(" ");
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < params.length; i++) {
            if (isOperator(params[i])) {
                stack.push(params[i]);
            } else if (params[i].equals("(")) {
                continue;
            } else if (params[i].equals(")")) {
                System.out.print(stack.pop() + " ");
            } else {
                System.out.print(params[i] + " ");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            infixToPostfix(scanner.nextLine());
        }
        scanner.close();
    }
    
    private static boolean isOperator(String s)
    {
        return (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"));
    }
}
