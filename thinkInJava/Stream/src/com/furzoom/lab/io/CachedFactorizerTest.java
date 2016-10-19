/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 19, 2016 9:49:10 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */

package com.furzoom.lab.io;

import java.util.Random;

/**
 * ClassName : CachedFactorizerTest <br>
 * Function : TODO ADD FUNCTION. <br>
 * date : Oct 19, 2016 9:49:10 AM <br>
 * 
 * @version
 */
public class CachedFactorizerTest {
	private final static int	COUNT	= 10;
	private static Thread[]		threads	= new Thread[COUNT];
	private static Random		random	= new Random(17);

	public static void main(String[] args) throws InterruptedException {
		CachedFactorizer cf = new CachedFactorizer();
		for (int i = 0; i < COUNT; i++) {
			threads[i] = new Thread(new Runnable() {
				public void run() {
					System.out.println(cf.service(random.nextInt(100)));
				}
			});
		}
		for (int i = 0; i < COUNT; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(cf);
	}
}
