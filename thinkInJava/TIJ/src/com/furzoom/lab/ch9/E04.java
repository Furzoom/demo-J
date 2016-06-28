/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 28, 2016 2:44:39 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch9;

/**
 * ClassName    : E04 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 28, 2016 2:44:39 PM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass sc = new SolidClass();
		SolidClass.display(sc);
	}

}

abstract class AbstractClass {
	
}

class SolidClass extends AbstractClass { 
	public void print() {
		System.out.println("SolidClass.print()");
	}
	public static void display(AbstractClass ac) {
		((SolidClass)ac).print();
	}
	
}