package com.furzoom.lab.ch10;

public class E21 implements I3 {
	public void print() {
		System.out.println("E21.print()");
	}
	public static void main(String[] args) {
		I3.C3.main(new E21());
	}
}

interface I3 {
	void print();
	static class C3 implements I3 {
		public void print() {
			System.out.println("Furzoom");
		}
		public static void main(I3 c) {
			c.print();
		}
	}
}