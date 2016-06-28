/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 28, 2016 5:46:35 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch9;

/**
 * ClassName    : E12 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 28, 2016 5:46:35 PM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adventrue.run();
	}

}

interface CanFight {
	void fight();
}

interface CanSwim {
	void swim();
}

interface CanFly {
	void fly();
}

interface CanClimb {
	void climb();
}

class ActionCharacter {
	public void fight() {
		System.out.println("ActionCharacter.fight()");
	}
}

class Hero extends ActionCharacter
	implements CanFight, CanSwim, CanFly, CanClimb {
	public void swim() {
		System.out.println("Hero.swim()");
	}
	public void fly() {
		System.out.println("Hero.fly()");
	}
	public void climb() {
		System.out.println("Hero.climb()");
	}
}

class Adventrue {
	public static void t(CanFight x) {
		x.fight();
	}
	public static void u(CanSwim x) {
		x.swim();
	}
	public static void v(CanFly x) {
		x.fly();
	}
	public static void w(ActionCharacter x) {
		x.fight();
	}
	public static void x(CanClimb x) {
		x.climb();
	}
	public static void run() {
		Hero h = new Hero();
		t(h);
		u(h);
		v(h);
		w(h);
		x(h);
	}
}