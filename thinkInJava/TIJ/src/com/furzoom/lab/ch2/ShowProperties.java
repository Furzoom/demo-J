/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : 2016-5-30 11:45:23
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch2;

import java.util.Date;

/**
 * ClassName    : ShowProperties <br>
 * date         : 2016-5-30 11:45:23 <br>
 * 
 * @author furzoom
 * @version 
 */
public class ShowProperties {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new Date());
		System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("java.library.path"));

	}

}
