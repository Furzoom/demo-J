/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 1, 2016 3:40:51 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch4;

/**
 * ClassName    : E06 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 1, 2016 3:40:51 PM <br>
 * 
 * @author mayan
 * @version 
 */
public class E06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(test(5, 1, 10));
		System.out.println(test(1, 1, 10));
		System.out.println(test(10, 1, 10));
		System.out.println(test(11, 1, 10));
	}
	
	public static int test(int testval, int begin, int end) {
		if (testval >= begin && testval <= end) {
			return 1;
		} else {
			return 0;
		}
	}

}
