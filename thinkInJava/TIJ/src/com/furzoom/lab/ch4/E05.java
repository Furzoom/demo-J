/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 1, 2016 2:09:01 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch4;

/**
 * ClassName    : E05 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 1, 2016 2:09:01 PM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int a = 0xaaaaaaaa;
		final int b = 0x55555555;
		System.out.println("a: ");
		printBinary(a);
		System.out.println("b: ");
		printBinary(b);
		System.out.println("~a: ");
		printBinary(~a);
		System.out.println("~b: ");
		printBinary(~b);
		System.out.println("a&b: ");
		printBinary(a&b);
		System.out.println("a|b: ");
		printBinary(a|b);
		System.out.println("a^b: ");
		printBinary(a^b);
	}

	public static void printBinary(int num) {
		int i = 32;
		while (i-- != 0) {
			if ((num & 0x80000000) != 0) {
				System.out.print("1");
			} else {
				System.out.print("0");
			}
			num <<= 1;
		}
		System.out.println();
	}
}
