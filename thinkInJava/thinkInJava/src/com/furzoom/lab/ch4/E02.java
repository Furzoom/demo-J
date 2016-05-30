/**
 * Author: mn
 * Copyright (c) 2013-2016, furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch4;

import java.util.Random;

/**
 * @author mn
 *
 */
public class E02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random random = new Random(1);
		int prev = random.nextInt();
		for (int i = 0; i < 25; ++i) {
			int num = random.nextInt();
			if (num < prev) {
				System.out.println("less than: " + num);
			} else if (num > prev) {
				System.out.println("greater than: " + num);
			} else {
				System.out.println("equal to :" + num);
			}
			prev = num;
		}
	}

}
