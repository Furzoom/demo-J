/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 22, 2016 5:50:07 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch7;

/**
 * ClassName    : E01 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 22, 2016 5:50:07 PM <br>
 * 
 * @author mayan
 * @version 
 */
public class E01 {
	Lazy lazy;
	
	public String toString() {
		if (lazy == null) {
			lazy = new Lazy();
		}
		return lazy.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E01 e = new E01();
		System.out.println(e);
	}

}

class Lazy {
	private String s;
	Lazy() {
		s = "lazy";
	}
	
	public String toString() {
		return s;
	}
	
}