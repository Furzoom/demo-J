/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 20, 2016 4:15:54 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

import java.util.Scanner;

/**
 * ClassName    : E10315 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Oct 20, 2016 4:15:54 PM <br>
 * 
 * @version 
 */
public class E10315
{
    public static void main(String[] args)
    {
        int k = Integer.parseInt(args[0]);
        Scanner scanner = new Scanner(System.in);
        Queue<String> q = new Queue<String>();
        while (scanner.hasNext()) {
            q.enqueue(scanner.next());
        }
        scanner.close();
        
        int size = q.size();
        for (int i = 0; i < size - k; i++) {
//            System.out.print(q.dequeue() + " ");
            q.dequeue();
        }
        System.out.println(q.dequeue());
    }
}
