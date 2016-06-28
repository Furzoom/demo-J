/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 17, 2016 4:17:38 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch5;

/**
 * ClassName    : E04 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 17, 2016 4:17:38 PM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bar f = new Bar("I'm Foo");
		System.out.println(f.getClass());
	}

}

class Bar {
	Bar() {
		System.out.println("Foo()");
	}
	Bar(String s) { 
		System.out.println("Foo(String s)");
		System.out.println(s);
	}
}