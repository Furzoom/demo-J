/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 23, 2016 2:07:10 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch7;

/**
 * ClassName    : E16 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 23, 2016 2:07:10 PM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog frog = new Frog("forg");
		Amphibian.swim(frog);
		Amphibian.run(frog);
	}

}

class Amphibian {
	public String name;
	public Amphibian(String name) {
		this.name = name;
	}
	public static void swim(Amphibian a) {
		System.out.println(a.name + " swim()");
	}
	public static void run(Amphibian a) {
		System.out.println(a.name + " run()");
	}
}

class Frog extends Amphibian {
	public Frog(String name) {
		super(name);
	}
}