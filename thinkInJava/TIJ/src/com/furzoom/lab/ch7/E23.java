/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 24, 2016 10:23:13 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch7;

/**
 * ClassName    : E23 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 24, 2016 10:23:13 AM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E23 {

	public static void main(String[] args) {
		System.out.println("start");
		System.out.println(LoadClass.a);
		LoadClass lc = new LoadClass();
		
	}
}

class LoadClass {
	public static int a = print("init");
	public static int print(String s) {
		System.out.println(s);
		return 10;
	}
}