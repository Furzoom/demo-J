/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 18, 2016 3:42:30 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.io;

/**
 * ClassName    : AccountTest <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Oct 18, 2016 3:42:30 PM <br>
 * 
 * @version 
 */
public class AccountTest
{
    private static final int NUM_OF_THREAD = 1000;
    static Thread[] threads = new Thread[NUM_OF_THREAD];
    
    public static void main(String[] args)
    {
        final Account acc = new Account("Jhon", 1000.0f);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < NUM_OF_THREAD; i++) {
            threads[i] = new Thread(new Runnable() {
                public void run() {
                    acc.deposit(100.0f);
                    acc.withdraw(100.0f);
                }
            });
            threads[i].start();
        }
        
        for (int i = 0; i < NUM_OF_THREAD; i++) {
            try {
                threads[i].join();
            } catch(InterruptedException e) {
                //ignore
            }
        }
        
        long endTime = System.currentTimeMillis();
        System.out.println("Finally, Jhon's balance is: " + acc.getBalance() 
                + "(" + (endTime - startTime) + "ms)");
    }
}
