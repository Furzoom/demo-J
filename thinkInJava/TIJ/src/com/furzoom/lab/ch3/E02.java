/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : May 30, 2016 3:35:36 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch3;

/**
 * ClassName    : E02 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : May 30, 2016 3:35:36 PM <br>
 * 
 * @author mayan
 * @version 
 */
public class E02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 10.7f;
		t2.level = 2.34f;
		System.out.println("1: t1.level: " + t1.level +
				           ", t2.level: " + t2.level);
		t1 = t2;
		System.out.println("2: t1.level: " + t1.level +
				           ", t2.level: " + t2.level);
		t1.level = 5.5f;
		System.out.println("3: t1.level: " + t1.level +
				           ", t2.level: " + t2.level);
	}

}

/**
 * 
 * ClassName    : Tank <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : May 30, 2016 3:36:20 PM <br>
 * 
 * @author mayan
 * @version
 */
class Tank {
	float level;
}