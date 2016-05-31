/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : May 30, 2016 4:01:52 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch3;

/**
 * ClassName    : E05 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : May 30, 2016 4:01:52 PM <br>
 * 
 * @author mayan
 * @version 
 */
public class E06 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog spot = new Dog();
		Dog scruffy = new Dog();
		spot.name = "spot";
		spot.says = "Ruff!";
		scruffy.name = "scruffy";
		scruffy.says = "Wurf!";
		
		System.out.println(spot.name + " : " + spot.says);
		System.out.println(scruffy.name + " : " + scruffy.says);
		
		Dog dog;
		dog = spot;
		System.out.println("dog == spot: " + (dog == spot));
		System.out.println("dog.equals(spot): " + dog.equals(spot));
		
		
	}
}
