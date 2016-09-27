package com.furzoom.lab.ch10;

public class E01 {
	private String value;
	E01() {
		
	}
	E01(String s) {
		value = s;
	}
	class Inner {
		public void print() {
			System.out.println("Inner.print()");
		}
		public String toString() {
			return value;
		}
	}
	public Inner getInner() {
		return new Inner();
	}
	public static void main(String[] args) {
		E01 e = new E01();
		E01.Inner in = e.getInner();
		in.print();
		e = new E01("furzoom");
		System.out.println(e.getInner());
	}

}
