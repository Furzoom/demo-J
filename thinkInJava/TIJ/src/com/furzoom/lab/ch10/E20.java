package com.furzoom.lab.ch10;

public class E20 {

	public static void main(String[] args) {
		I2.C2 c = new I2.C2();
		c.print();
	}

}

interface I2 {
	void print();
	static class C2 implements I2 {
		public void print() {
			System.out.println("Furzoom");
		}
	}
}