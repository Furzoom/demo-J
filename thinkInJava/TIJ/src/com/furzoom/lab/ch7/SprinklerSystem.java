/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 22, 2016 3:56:37 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch7;

/**
 * ClassName    : SprinklerSystem <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 22, 2016 3:56:37 PM <br>
 * 
 * @author mayan
 * @version 
 */
public class SprinklerSystem {
	private String v1, v2, v3, v4;
	private WaterSource source = new WaterSource();
	private int i;
	private float f;
	public String toString() {
		return "v1 = " + v1 + " " +
			   "v2 = " + v2 + " " +
			   "v3 = " + v3 + " " +
			   "v4 = " + v4 + "\n" +
			   "i = " + i + " " + "f = " + f + " " +
			   "source = " + source;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SprinklerSystem ss = new SprinklerSystem();
		System.out.println(ss);
	}

}

class WaterSource {
	private String s;
	WaterSource() {
		System.out.println("WaterSource()");
		s = "Constructor";
	}
	public String toString() {
		return s;
	}
}