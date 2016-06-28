/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 22, 2016 6:16:46 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch7;

/**
 * ClassName    : E05 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 22, 2016 6:16:46 PM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
	}

}

class A {
	A() {
		System.out.println("A");
	}
}

class B {
	B() {
		System.out.println("B");
	}
}

class C extends A {
	B b = new B();
}