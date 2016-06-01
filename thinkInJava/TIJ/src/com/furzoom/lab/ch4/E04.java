/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 1, 2016 11:38:19 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch4;

/**
 * ClassName    : E04 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 1, 2016 11:38:19 AM <br>
 * 
 * @author mayan
 * @version 
 */
public class E04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 2; i < 100; ++i) {
			int j = i / 2;
			while (j >= 2) {
				if (i % j == 0) break;
				--j;
			}
			if (j == 1) {
				System.out.println(i);
			}
		}
	}
}
