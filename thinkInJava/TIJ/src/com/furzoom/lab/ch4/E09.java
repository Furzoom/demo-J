/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 1, 2016 4:01:56 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch4;

/**
 * ClassName    : E09 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 1, 2016 4:01:56 PM <br>
 * 
 * @author mayan
 * @version 
 */
public class E09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i < 10; ++i) {
			printFibonacci(i);
		}
	}
	
	public static void printFibonacci(int n) {
		if (n < 1) return;
		int f1, f2, f3;
		f1 = f2 = 1;
		if (n == 1) {
			System.out.println(f1);
			return;
		}
		if (n == 2) {
			System.out.println(f1 + " " + f2);
			return;
		}
		
		System.out.print(f1 + " " + f2);
		while (n-- > 2) {
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			System.out.print(" " + f3);
		}
		System.out.println();
		
	}
}
