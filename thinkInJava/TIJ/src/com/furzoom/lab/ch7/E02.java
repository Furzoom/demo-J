/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 22, 2016 5:59:48 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch7;

/**
 * ClassName    : E02 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 22, 2016 5:59:48 PM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E02 extends Detergent{
	public void scrub() {
		append(" E02.scrub()");
		super.scrub();
	}
	public void sterilize() {
		append(" sterilize()");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E02 e = new E02();
		e.scrub();
		e.sterilize();
		System.out.println(e);
		System.out.println("Testing base class");
		Detergent.main(args);
		

	}
}

class Cleanser {
	private String s = "Cleanser";
	public void append(String a) {
		s += a;
	}
	public void dilute() {
		append(" dilute()");
	}
	public void apply() {
		append(" apply()");
	}
	public void scrub() {
		append(" scrub()");
	}
	public String toString() {
		return s;
	}
	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		System.out.println(x);
	}
}

class Detergent extends Cleanser {
	public void scrub() {
		append(" Detergent.scrub()");
		super.scrub();
	}
	public void foam() {
		append(" foam()");
	}
	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println("Tesing base class");
		Cleanser.main(args);
	}
}