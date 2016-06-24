/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 23, 2016 10:57:58 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch7;

/**
 * ClassName    : E13 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 23, 2016 10:57:58 AM <br>
 * 
 * @author mayan
 * @version 
 */
public class E13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHouse mh = new MyHouse();
		mh.clean('c');
		mh.clean(1);
		short sh = 10;
		mh.clean(sh);
		mh.clean("clean");
	}

}

class House {
	void clean(int i) {
		System.out.println("clean(int)");
	}
	void clean(char c) {
		System.out.println("clean(char)");
	}
	void clean(short sh) {
		System.out.println("clean(short)");
	}
}

class MyHouse extends House {
	//@Override
	void clean(String s) {
		System.out.println("clean(String)");
	}
	@Override
	void clean(int i) {
		System.out.println("MyHouse.clean(int)");
	}
}