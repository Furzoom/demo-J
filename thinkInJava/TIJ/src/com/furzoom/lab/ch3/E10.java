/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : May 30, 2016 4:39:26 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch3;

/**
 * ClassName    : E10 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : May 30, 2016 4:39:26 PM <br>
 * 
 * @author mayan
 * @version 
 */
public class E10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int a = 0xaaaaaaaa;
		final int b = 0x55555555;
		System.out.println("a: " + Integer.toBinaryString(a));
		System.out.println("b: " + Integer.toBinaryString(b));
		System.out.println("~a: " + Integer.toBinaryString(~a));
		System.out.println("~b: " + Integer.toBinaryString(~b));
		System.out.println("a&b: " + Integer.toBinaryString(a&b));
		System.out.println("a|b: " + Integer.toBinaryString(a|b));
		System.out.println("a^b: " + Integer.toBinaryString(a^b));

	}

}
