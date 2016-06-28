/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 28, 2016 1:14:21 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch8;

/**
 * ClassName    : E13 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 28, 2016 1:14:21 PM <br>
 * 
 * @author mayan
 * @version 
 */
public class E13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shared shared = new Shared();
		Composing[] composing = {
				new Composing(shared),
				new Composing(shared),
				new Composing(shared),
				new Composing(shared),
				new Composing(shared),
		};
		for (Composing c : composing) {
			c.dispose();
		}
	}

}

class Shared {
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;
	public Shared() {
		System.out.println("Creating " + this);
	}
	public void addRef() {
		refcount ++;
	}
	protected void dispose() {
		if (--refcount == 0) {
			System.out.println("disposing " + this);
		}
	}
	public String toString() {
		return "Shared " + id;
	}
}

class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
	public Composing(Shared shared) {
		System.out.println("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}
	protected void dispose() {
		System.out.println("disposing " + this);
		shared.dispose();
	}
	public String toString() {
		return "Composing " + id;
	}
}