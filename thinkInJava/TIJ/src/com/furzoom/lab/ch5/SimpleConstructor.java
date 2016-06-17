/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 17, 2016 3:54:14 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch5;

/**
 * ClassName    : SimpleConstructor <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 17, 2016 3:54:14 PM <br>
 * 
 * @author mayan
 * @version 
 */
public class SimpleConstructor {
	public static void main(String[] args) {
		for (int i = 0; i < 10; ++i) {
			new Rock();
		}
	}

}


class Rock {
	Rock() {
		System.out.print("Rock ");
	}
}