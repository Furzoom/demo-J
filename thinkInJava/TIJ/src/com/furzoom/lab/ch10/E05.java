package com.furzoom.lab.ch10;

public class E05 {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.print();
	}

}

class Outer {
	private String value = "furzoom";
	class Inner {
		public void print() {
			System.out.println(value);
		}
	}
}