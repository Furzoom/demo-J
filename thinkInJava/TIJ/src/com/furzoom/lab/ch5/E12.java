/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 17, 2016 5:24:27 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch5;

/**
 * ClassName    : E12 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 17, 2016 5:24:27 PM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank t = new Tank();
		t = null;
		System.gc();
	}

}

class Tank {
	private boolean full;
	Tank() {
		full = true;
	}
	
	void clear() {
		full = false;
	}
	
	protected void finalize() {
		if (full) {
			System.out.println("full");
		}
	}
}