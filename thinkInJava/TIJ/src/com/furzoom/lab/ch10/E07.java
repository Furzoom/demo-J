package com.furzoom.lab.ch10;

public class E07 {
	private String value;
	private void print() {
		System.out.println(value);
	}
	public E07() {
		value = "furzoom";
	}
	public void test() {
		Inner inner = new Inner();
		inner.setValue("MN");
		inner.print();
	}
	class Inner {
		public void setValue(String v) {
			E07.this.value = v;
		}
		public void print() {
			E07.this.print();
		}
	}
	
	public static void main(String[] args) {
		E07 e = new E07();
		e.print();
		e.test();
	}

}
