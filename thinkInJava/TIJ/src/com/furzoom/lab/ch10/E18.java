package com.furzoom.lab.ch10;

public class E18 {
	public static class A {
		public void print() {
			System.out.println("furzoom");
		}
	}
	public static A getA() {
		return new A();
	}
	public static void main(String[] args) {
		A a = getA();
		a.print();
	}
}
