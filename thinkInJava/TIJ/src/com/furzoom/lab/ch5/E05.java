/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 17, 2016 4:20:57 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch5;

/**
 * ClassName    : E05 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 17, 2016 4:20:57 PM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E05 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.bark(10);
		short x = 12;
		d.bark(x);
	}
}

class Dog {
	void bark() {
		System.out.println("bark~~~");
	}
	void bark(int i) {
		System.out.println("barking...");
	}
	void bark(short sh) {
		System.out.println("howling...");
	}
	void bark(int i, short sh) {
		System.out.println("int short");
	}
	void bark(short sh, int i) {
		System.out.println("short int");
	}
}