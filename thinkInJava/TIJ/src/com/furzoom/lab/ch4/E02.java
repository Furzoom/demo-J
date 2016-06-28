/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 1, 2016 11:10:28 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch4;

import java.util.Random;

/**
 * ClassName    : E02 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 1, 2016 11:10:28 AM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random random = new Random(1);
		int prev = random.nextInt(10);
		for (int i = 0; i < 25; ++i) {
			int num = random.nextInt(10);
			if (num > prev) {
				System.out.println(num + " greater than " + prev);
			} else if (num < prev) {
				System.out.println(num + " less than " + prev);
			} else {
				System.out.println(num + " equals " + prev);
			}
			prev = num;
		}
		
	}

}
