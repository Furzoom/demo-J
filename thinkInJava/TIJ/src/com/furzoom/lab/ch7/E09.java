/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 23, 2016 9:46:33 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch7;

/**
 * ClassName    : E09 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 23, 2016 9:46:33 AM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stem stem = new Stem();
	}

}

class Component1 {
	Component1() {
		System.out.println("Component1");
	}
	void dispose() {
		System.out.println("Component1.dispose()");
	}
}

class Component2 {
	Component2() {
		System.out.println("Component2");
	}
	void dispose() {
		System.out.println("Component2.dispose()");
	}
}

class Component3 {
	Component3() {
		System.out.println("Component3");
	}
	void dispose() {
		System.out.println("Component3.dispose()");
	}
}

class Root {
	private Component1 p1 = new Component1();
	private Component2 p2 = new Component2();
	private Component3 p3 = new Component3();
	Root() {
		System.out.println("Root()");
	}
	void dispose() {
		p1.dispose();
		p2.dispose();
		p3.dispose();
		System.out.println("Root.dispose()");
	}
}

class Stem extends Root {
	private Component1 p1 = new Component1();
	private Component2 p2 = new Component2();
	private Component3 p3 = new Component3();
	Stem() {
		System.out.println("Stem()");
	}
	void dispose() {
		p1.dispose();
		p2.dispose();
		p3.dispose();
		System.out.println("Stem.dispose()");
		super.dispose();
	}
}