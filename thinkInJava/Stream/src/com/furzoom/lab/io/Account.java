/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 18, 2016 3:09:31 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */

package com.furzoom.lab.io;

import java.util.Random;

/**
 * ClassName : Account <br>
 * Function : TODO ADD FUNCTION. <br>
 * date : Oct 18, 2016 3:09:31 PM <br>
 * 
 * @version
 */
public class Account {
	private String	name;
	private float	amount;
	private Random	random;

	public Account(String name, float amount) {
		this.name = name;
		this.amount = amount;
		random = new Random(17);
	}

	public synchronized void deposit(float amt) {
		float tmp = amount;
		tmp += amt;
		try {
			Thread.sleep(random.nextInt(100));
		} catch (InterruptedException e) {
			// ignore
		}

		amount = tmp;
	}

	public synchronized void withdraw(float amt) {
		float tmp = amount;
		tmp -= amt;

		try {
			Thread.sleep(random.nextInt(100));
		} catch (InterruptedException e) {
			// ignore
		}

		amount = tmp;
	}

	public float getBalance() {
		return amount;
	}
}
