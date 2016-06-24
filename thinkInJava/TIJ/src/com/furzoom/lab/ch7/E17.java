/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 23, 2016 2:33:26 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch7;

/**
 * ClassName    : E17 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 23, 2016 2:33:26 PM <br>
 * 
 * @author mayan
 * @version 
 */
public class E17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog2 frog = new Frog2("frog2");
		Frog2.swim(frog);
		Amphibian.swim(frog);
		Frog2.run(frog);
	}

}

class Frog2 extends Amphibian {
	Frog2(String name) {
		super(name);
	}
	public static void swim(Amphibian a) {
		System.out.println("Frog2.swim()");
	}
}