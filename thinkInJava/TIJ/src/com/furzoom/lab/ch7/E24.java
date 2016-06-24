/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 24, 2016 1:56:26 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch7;

/**
 * ClassName    : E24 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 24, 2016 1:56:26 PM <br>
 * 
 * @author mayan
 * @version 
 */
public class E24 extends Beetle{
	private int l = printInit("E24.l initialized");
	public E24() {
		System.out.println("j = " + j);
		System.out.println("l = " + l);
	}
	private static int x3 = printInit("E24.x3 initialized");
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("E24 constructor");
		E24 e = new E24();
	}

}

class Insect {
	private int i = 9;
	protected int j;
	Insect() {
		System.out.println("i = " + i + ", j = " + j);
		j = 39;
	}
	private static int x1 = printInit("static Insect.x1 initialized");
	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
}

class Beetle extends Insect {
	private int k = printInit("Beetle.k initialized");
	public Beetle() {
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	private static int x2 = printInit("static Beetle.x2 initialized");
}

