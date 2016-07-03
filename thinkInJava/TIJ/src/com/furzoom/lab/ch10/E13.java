package com.furzoom.lab.ch10;

public class E13 {
	interface I1 {
		void method();
	}
	public I1 get() {
		return new I1() {
			public void method() {
				System.out.println("furzoom");
			}
		};
	}
	public static void main(String[] args) {
		E13 e = new E13();
		E13.I1 i = e.get();
		i.method();
	}

}
