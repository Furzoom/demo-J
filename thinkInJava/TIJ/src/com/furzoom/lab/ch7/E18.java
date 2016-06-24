/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 24, 2016 9:47:36 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch7;

import java.util.Random;

/**
 * ClassName    : E18 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 24, 2016 9:47:36 AM <br>
 * 
 * @author mayan
 * @version 
 */
public class E18 {
	static final Random random = new Random(10);
	static final int i1 = random.nextInt(20);
	final int i2 = random.nextInt(20);
	void display() {
		System.out.println("i1: " + i1 + "\ti2: " + i2);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E18 e1 = new E18();
		e1.display();
		E18 e2 = new E18();
		e2.display();
		e1.display();
	}

}
