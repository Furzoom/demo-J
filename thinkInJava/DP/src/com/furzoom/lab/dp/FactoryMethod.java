package com.furzoom.lab.dp;

public class FactoryMethod {

	public static void main(String[] args) {
		Factory fa = new ConcreteFactoryA();
		Product pa = fa.factoryMethod();
		pa.use();
		
		
		Factory fb = new ConcreteFactoryB();
		Product pb = fb.factoryMethod();
		pb.use();
	}

}

interface Factory {
	Product factoryMethod();
}

class ConcreteFactoryA implements Factory {
	public Product factoryMethod() {
		return new ConcreteProductA();
	}
}

class ConcreteFactoryB implements Factory {
	public Product factoryMethod() {
		return new ConcreteProductB();
	}
}