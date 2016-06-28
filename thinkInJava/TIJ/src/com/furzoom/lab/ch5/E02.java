/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 17, 2016 3:58:50 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch5;

/**
 * ClassName    : E02 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 17, 2016 3:58:50 PM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E02 {

	public String s1 = "inline init";
	public String s2;
	E02(String s) {
		s2 = s;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E02 e = new E02("constructor");
		System.out.println(e.s1);
		System.out.println(e.s2);

	}

}
