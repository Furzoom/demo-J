package com.furzoom.lab.ch10;

public class E08 {
	class Inner {
		private String value = "furzoom";
	}
	public void printValue() {
		Inner inner = new Inner();
		System.out.println(inner.value);
	}
	public static void main(String[] args) {
		E08 e = new E08();
		e.printValue();
	}
}
