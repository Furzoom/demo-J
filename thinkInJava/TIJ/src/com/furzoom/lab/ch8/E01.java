/**
 * Description : E01, E05
 * Author      : mn@furzoom.com
 * Date        : Jun 24, 2016 3:02:41 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch8;

/**
 * ClassName    : E01 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 24, 2016 3:02:41 PM <br>
 * 
 * @author mayan
 * @version 
 */
public class E01 {
	static void start(Cycle c) {
		c.ride();
		c.wheels();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unicycle u = new Unicycle();
		Bicycle b = new Bicycle();
		Tricycle c = new Tricycle();
		start(u);
		start(b);
		start(c);
	}

}

class Cycle {
	void ride() {
		System.out.println("Cycle");
	}
	public int wheels() {
		System.out.println("Cycle.wheels()");
		return 2;
	}
}

class Unicycle extends Cycle {
	void ride() {
		System.out.println("Unicycle");
	}
}

class Bicycle extends Cycle {
	void ride() {
		System.out.println("Bicycle");
	}
}

class Tricycle extends Cycle {
	void ride() {
		System.out.println("Tricycle");
	}
}