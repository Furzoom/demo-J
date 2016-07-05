package com.furzoom.lab.dp;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		AbstractFactory af1 = new ConcreteFactory1();
		AbstractProductA a1 = af1.createProductA();
		a1.use();
		AbstractProductB b1 = af1.createProductB();
		b1.use();
		af1 = new ConcreteFactory2();
		a1 = af1.createProductA();
		b1 = af1.createProductB();
		a1.use();
		b1.use();
	}

}

interface AbstractProductA {
	void use();
}

interface AbstractProductB {
	void use();
}

interface AbstractFactory {
	AbstractProductA createProductA();
	AbstractProductB createProductB();
}

class ProductA1 implements AbstractProductA {
	public void use() {
		System.out.println("ProductA1.use()");
	}
}

class ProductA2 implements AbstractProductA {
	public void use() {
		System.out.println("ProductA2.use()");
	}
}

class ProductB1 implements AbstractProductB {
	public void use() {
		System.out.println("ProductB1.use()");
	}
}

class ProductB2 implements AbstractProductB {
	public void use() {
		System.out.println("ProductB2.use()");
	}
}

class ConcreteFactory1 implements AbstractFactory {
	public AbstractProductA createProductA() {
		return new ProductA1();
	}
	public AbstractProductB createProductB() {
		return new ProductB1();
	}
}

class ConcreteFactory2 implements AbstractFactory {
	public AbstractProductA createProductA() {
		return new ProductA2();
	}
	public AbstractProductB createProductB() {
		return new ProductB2();
	}
}