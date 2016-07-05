package com.furzoom.lab.dp;

public class SimpleFactory {
	public static Product createProduct(String s) {
		if (s.equals("A")) {
			return new ConcreteProductA();
		} else if (s.equals("B")) {
			return new ConcreteProductB();
		} else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		SimpleFactory.createProduct("A").use();
		SimpleFactory.createProduct("B").use();
	}

}

interface Product {
	void use();
}

class ConcreteProductA implements Product {
	public void use() {
		System.out.println("ConcreteProductA.use()");
	}
}

class ConcreteProductB implements Product {
	public void use() {
		System.out.println("ConcreteProductB.use()");
	}
}

