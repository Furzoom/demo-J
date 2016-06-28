/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 17, 2016 4:41:42 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch5;

/**
 * ClassName    : E08 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 17, 2016 4:41:42 PM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E08 e = new E08();
		e.method1();
	}
	public void method1() {
		method2();
		this.method2();
	}
	public void method2() {
		System.out.println("method2");
	}
}