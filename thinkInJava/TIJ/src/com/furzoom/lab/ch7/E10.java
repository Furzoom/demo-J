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
 * @author mayan
 * @version 
 */
public class E10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stem1 stem = new Stem1(10);
	}

}

class Component4 {
	Component4(int i) {
		System.out.println("Component4(" + i + ")");
	}
}

class Component5 {
	Component5(int i) {
		System.out.println("Component5(" + i + ")");
	}
}

class Component6 {
	Component6(int i) {
		System.out.println("Component6(" + i + ")");
	}
}

class Root1 {
	private Component4 p4 = new Component4(1);
	private Component5 p5 = new Component5(2);
	private Component6 p6 = new Component6(3);
	Root1(int i) {
		System.out.println("Root1(" + i + ")");
	}
}

class Stem1 extends Root1 {
	private Component4 p4 = new Component4(4);
	private Component5 p5 = new Component5(5);
	private Component6 p6 = new Component6(6);
	Stem1(int i) {
		super(i);
		System.out.println("Stem1(" + i + ")");
	}
}