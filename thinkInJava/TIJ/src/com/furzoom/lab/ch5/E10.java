/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 17, 2016 4:58:35 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch5;

/**
 * ClassName    : E10 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 17, 2016 4:58:35 PM <br>
 * 
 * @author mayan
 * @version 
 */
public class E10 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E10 e = new E10();
		System.gc();
		e = new E10();
		e = new E10();
		System.gc();
	}

	protected void finalize() {
		System.out.println("finalize()");
	}
}
