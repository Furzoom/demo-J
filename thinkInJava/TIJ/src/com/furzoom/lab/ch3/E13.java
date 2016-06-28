/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : May 30, 2016 5:07:57 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch3;

/**
 * ClassName    : E13 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : May 30, 2016 5:07:57 PM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printChar('a');
		printChar('b');
		printChar('1');
	}
	
	public static void printChar(char c) {
		System.out.println(c + ":" + (int)c + " "+ Integer.toBinaryString(c));
	}

}
