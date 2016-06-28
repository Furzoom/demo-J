/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 23, 2016 10:00:48 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch7;

/**
 * ClassName    : E11 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 23, 2016 10:00:48 AM <br>
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
		Detergent1 d = new Detergent1();
		d.dilute();
		d.apply();
		d.scrub();
		d.foam();
		System.out.println(d);
	}

}

class Detergent1 {
	private Cleanser c = new Cleanser();
	public void dilute() {
		c.dilute();
	}
	public void apply() {
		c.apply();
	}
	public void scrub() {
		c.append(" Detergent1.scrub()");
		c.scrub();
	}
	public void foam() {
		c.append(" foam()");
	}
	public String toString() {
		return c.toString();
	}
}