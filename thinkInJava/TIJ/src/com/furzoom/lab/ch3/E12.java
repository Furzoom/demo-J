/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : May 30, 2016 5:04:29 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch3;

/**
 * ClassName    : E12 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : May 30, 2016 5:04:29 PM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 0xffffffff;
		System.out.println("a << 0: " + Integer.toBinaryString(a << 0));
		System.out.println("a << 1: " + Integer.toBinaryString(a << 1));
		
		printBinary(a, 0);
		printBinary(a, 1);
		printBinary(a, 2);
		printBinary(a, 3);
		printBinary(a, 4);
		printBinary(a, 5);
		printBinary(a, 6);
		printBinary(a, 7);
		printBinary(a, 8);
		printBinary(a, 9);
		printBinary(a, 10);
		printBinary(a, 11);
		printBinary(a, 12);
		printBinary(a, 13);
		printBinary(a, 14);
		printBinary(a, 15);
		printBinary(a, 16);
		printBinary(a, 17);
		printBinary(a, 18);
		printBinary(a, 19);
		printBinary(a, 20);
		printBinary(a, 21);
		printBinary(a, 22);
		printBinary(a, 23);
		printBinary(a, 24);
		printBinary(a, 25);
		printBinary(a, 26);
		printBinary(a, 27);
		printBinary(a, 28);
		printBinary(a, 29);
		printBinary(a, 30);
		printBinary(a, 31);
	}
	
	public static void printBinary(int num, int bit) {
		System.out.println(num + " >>> " + bit + ": " + Integer.toBinaryString(num >>> bit));
	}
}
