package com.furzoom.lab.ch10;

public class E09 {
	interface Interface1 {
		void print();
	}
	public Interface1 getPrint() {
		class Cls1 implements Interface1 {
			public void print() {
				System.out.println("Furzoom");
			}
		}
		return new Cls1();
	}
	public Interface1 getPrint2() {
		if (true) {
			class Cls1 implements Interface1 {
				public void print() {
					System.out.println("testE10.print()");
				}
			}
			return new Cls1();
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E09 e = new E09();
		E09.Interface1 inter = e.getPrint();
		inter.print();
		e.getPrint2().print();
	}

}
