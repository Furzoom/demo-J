/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 28, 2016 6:02:05 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch9;

/**
 * ClassName    : E13 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 28, 2016 6:02:05 PM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Imp3Interface ii = new Imp3Interface();
		ii.print();
		ii.printD1();
		ii.printD2();
		ii.printD3();
	}

}

interface BaseInter {
	void print();
}

interface DerivedInter1 extends BaseInter {
	void printD1();
}

interface DerivedInter2 extends BaseInter {
	void printD2();
}

interface DerivedInter3 extends DerivedInter1, DerivedInter2 {
	void printD3();
}

class Imp3Interface implements DerivedInter3 {
	@Override
	public void printD1() {
		System.out.println("printD1");
	}

	@Override
	public void print() {
		System.out.println("print");
	}

	@Override
	public void printD2() {
		System.out.println("printD2");
	}

	@Override
	public void printD3() {
		System.out.println("printD3");
	}
	
}