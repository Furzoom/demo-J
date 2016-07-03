package com.furzoom.lab.ch10;

public class E12 {
	private String value = "furzoom";
	interface Inner {
		void print();
		void setValue(String v);
	}
	public void test() {
		getInner().print();
		getInner().setValue("MN");
		getInner().print();
	}
	private Inner getInner() {
		return new Inner() {
			public void print() {
				System.out.println(value);
			}
			public void setValue(String v) {
				E12.this.value = v;
			}
		};
	}
	
	public static void main(String[] args) {
		E12 e = new E12();
		e.test();
	}

}
