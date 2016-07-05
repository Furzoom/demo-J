package com.furzoom.lab.dp;

public class AdapterTest {

	public static void main(String[] args) {
		Adaptee ca = new ConcreteAdaptee();
		Adapter a = new Adapter(ca);
		a.request();
	}

}

interface Target {
	void request();
}

interface Adaptee {
	void specialRequest();
}

class Adapter implements Target {
	private Adaptee adaptee;
	public Adapter(Adaptee a) {
		this.adaptee = a;
	}
	public void request() {
		adaptee.specialRequest();
	}
}

class ConcreteAdaptee implements Adaptee {
	public void specialRequest() {
		System.out.println("ConcreteAdaptee.specialRequest()");
	}
}
