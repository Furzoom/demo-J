/**
 * Description : E09, E12
 * Author      : mn@furzoom.com
 * Date        : Jun 27, 2016 6:07:29 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch8;

/**
 * ClassName    : E09 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 27, 2016 6:07:29 PM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E09 {
	public static void eatTest(Rodent r) {
		r.eat();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rodent[] r = {
				new Mouse(),
				new Gerbil(),
				new Hamster(),
		};
		for (Rodent i : r) {
			eatTest(i);
		}
	}

}

class Rodent {
	public Rodent() {
		System.out.println("Rodent()");
	}
	public void eat() {
		System.out.println("Rodent.eat()");
	}
}

class Mouse extends Rodent {
	public Mouse() {
		System.out.println("Mouse()");
	}
	public void eat() {
		System.out.println("Mouse.eat()");
	}
}

class Gerbil extends Rodent {
	public Gerbil() {
		System.out.println("Gerbil()");
	}
	public void eat() {
		System.out.println("Gerbil.eat()");
	}
}

class Hamster extends Rodent {
	public Hamster() {
		System.out.println("Hamster");
	}
	public void eat() {
		System.out.println("Hanster.eat()");
	}
}
