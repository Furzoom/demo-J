/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 17, 2016 5:14:01 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch5;

/**
 * ClassName    : E11 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 17, 2016 5:14:01 PM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E11 e = new E11();
		e = null;
		System.gc();
	}

	protected void finalize() {
		System.out.println("finalize()");
	}
}
