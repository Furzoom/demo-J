/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 23, 2016 9:33:38 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch7;

/**
 * ClassName    : E08 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 23, 2016 9:33:38 AM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived d1 = new Derived();
		System.out.println("Another test...");
		Derived d2 = new Derived(10);
	}

}

class Base {
	Base(int i) {
		System.out.println("Base(" + i + ")");
	}
}

class Derived extends Base {
	Derived() {
		super(1);
		System.out.println("Derived()");
	}
	Derived(int i) {
		super(i);
		System.out.println("Derived(" + i + ")");
	}
}