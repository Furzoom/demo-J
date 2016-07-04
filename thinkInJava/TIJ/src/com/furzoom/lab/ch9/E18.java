/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jul 1, 2016 3:11:50 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch9;

/**
 * ClassName    : E18 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jul 1, 2016 3:11:50 PM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E18 {
	public static void ride(CycleFactory cf) {
		cf.getCycle().run();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ride(new UnicycleFactory());
		ride(new BicycleFactory());
		ride(new TricycleFactory());
	}

}

interface Cycle {
	void run();
}

interface CycleFactory {
	Cycle getCycle();
}

class Unicycle implements Cycle {
	public void run() {
		System.out.println("Unicycle.run()");
	}
}

class Bicycle implements Cycle {
	public void run() {
		System.out.println("Bicycle.run()");
	}
}

class Tricycle implements Cycle {
	public void run() {
		System.out.println("Tricycle.run()");
	}
}

class UnicycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Unicycle();
	}
}

class BicycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Bicycle();
	}
}

class TricycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Tricycle();
	}
}