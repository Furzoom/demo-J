/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 27, 2016 5:49:18 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch8;

/**
 * ClassName    : E07 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 27, 2016 5:49:18 PM <br>
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
		InstrumentGenerator ig = new InstrumentGenerator();
		Instrument[] orchestra = new Instrument[20];
		for (int i = 0; i < orchestra.length; i++) {
			orchestra[i] = ig.next();
		}
		E06.tuneAll(orchestra);
		
	}

}
