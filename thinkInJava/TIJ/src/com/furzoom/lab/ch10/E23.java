package com.furzoom.lab.ch10;

public class E23 {

	public static void main(String[] args) {
		A1 a1 = new A1();
		A1 a2 = new A1();
		A1 a3 = new A1();
		B1 b = new B1(3);
		b.add(a1.getU());
		b.add(a2.getU());
		b.add(a3.getU());
		b.walk();
		b.clear();
	}

}

interface U {
	void a();
	void b();
	void c();
}

class A1 {
	public U getU() {
		return new U() {
			public void a() {
				System.out.println("U.a()");
			}
			public void b() {
				System.out.println("U.b()");
			}
			public void c() {
				System.out.println("U.c()");
			}
		};
	}
}

class B1 {
	private U[] uArr;
	private int index = 0;
	public B1(int i) {
		uArr = new U[i];
	}
	public void add(U u) {
		if (index < uArr.length) {
			uArr[index++] = u;
		}
	}
	public void clear() {
		for (int i = 0; i < uArr.length; ++i) {
			uArr[i] = null;
		}
	}
	public void walk() {
		for (int i = 0; i < uArr.length; ++i) {
			if (uArr[i] != null) {
				uArr[i].a();
				uArr[i].b();
				uArr[i].c();
			}
		}
	}
}