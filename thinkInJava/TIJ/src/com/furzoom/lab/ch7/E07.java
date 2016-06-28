/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 23, 2016 9:26:58 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch7;

/**
 * ClassName    : E07 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 23, 2016 9:26:58 AM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CC c = new CC();
	}

}

class AA {
	AA(int i) {
		System.out.println("AA(" + i + ")");
	}
}

class BB {
	BB(int i) {
		System.out.println("BB(" + i + ")");
	}
}

class CC extends AA {
	private BB b1;
	
	{
		b1 = new BB(3);
	}
	private BB b = new BB(2);
	
	CC() {
		super(1);
		System.out.println("CC()");
	}
}