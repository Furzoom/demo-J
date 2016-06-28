/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 24, 2016 9:59:24 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch7;

/**
 * ClassName    : E20 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 24, 2016 9:59:24 AM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t = new Test1();
		t.display();
	}

}

class Test {
	private void method1() {
		System.out.println("method1()");
	}
	void display() {
		method1();
	}
}

class Test1 extends Test {
	//@Override
	public void method1() {
		System.out.println("method1() in Test1");
	}
	void display() {
		method1();
	}
}