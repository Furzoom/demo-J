/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 23, 2016 11:43:24 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch7;

/**
 * ClassName    : E14 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 23, 2016 11:43:24 AM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.engine.service();
	}

}

class Engine {
	public void start() {}
	public void rev() {}
	public void stop() {}
	public void service() {
		System.out.println("service()");
	}
}

class Wheel {
	public void inflate(int psi) {}
}

class Window {
	public void rollup() {}
	public void rolldown() {}
}

class Door {
	public Window window = new Window();
	public void open() {}
	public void close() {}
}

class Car {
	public Engine engine = new Engine();
	public Wheel[] wheel = new Wheel[4];
	public Door left = new Door();
	public Door right = new Door();
	public Car() {
		for (int i = 0; i < 4; ++i) {
			wheel[i] = new Wheel();
		}
	}
}