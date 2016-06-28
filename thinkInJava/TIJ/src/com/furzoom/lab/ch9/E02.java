/**
 * Description : E02, E03
 * Author      : mn@furzoom.com
 * Date        : Jun 28, 2016 2:36:56 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch9;

/**
 * ClassName    : E02 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 28, 2016 2:36:56 PM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base;
		// error
		//base = new Base();
		base = new Derived();
		base.print();
	}

}

abstract class Base {
	public Base() {
		print();
	}
	public abstract void print();
}

class Derived extends Base {
	private int a = 10;
	public void print() {
		System.out.println(a);
	}
}