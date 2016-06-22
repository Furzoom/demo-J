/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 22, 2016 6:10:46 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch7;

/**
 * ClassName    : E03 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 22, 2016 6:10:46 PM <br>
 * 
 * @author mayan
 * @version 
 */
public class E03 extends Drawing{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E03 e = new E03();
		System.out.println("next test");
		Cartoon c = new Cartoon();
	}

}

class Art {
	Art() {
		System.out.println("Art constructor");
	}
}

class Drawing extends Art {
	Drawing() {
		System.out.println("Drawing constructor");
	}
}

class Cartoon extends Drawing {
	Cartoon() {
		System.out.println("Cartoon constructor");
	}
}