/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : May 30, 2016 3:40:33 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch3;

/**
 * ClassName    : E03 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : May 30, 2016 3:40:33 PM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Letter x = new Letter();
		x.c = 10.23f;
		System.out.println("1: x.c: " + x.c);
		f(x);
		System.out.println("2: x.c: " + x.c);
	}
	
	/**
	 * 
	 * @param y
	 */
	static void f(Letter y) {
		y.c = 5.5f;
	}

}

/**
 * 
 * ClassName    : Letter <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : May 30, 2016 3:40:43 PM <br>
 * 
 * @author furzoom
 * @version
 */
class Letter {
	float c;
}