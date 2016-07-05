package com.furzoom.lab.dp;

public class BuilderPattern {

	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder();
		Director d = new Director(builder);
		Product p = d.construct();
	}

}

abstract class Builder {
	protected Product product;
	public abstract void buildPartA();
	public abstract void buildPartB();
	public abstract void buildPartC();
	public Product getResult() {
		return product;
	}
}

class ConcreteBuilder extends Builder {
	public ConcreteBuilder() {
		this.product = new ConcreteProductA();
	}
	public void buildPartA() {
		product.use();
	}
	public void buildPartB() {
		//product.useB();
	}
	public void buildPartC() {
		//product.useC();
	}
}

class Director {
	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	public Product construct() {
		builder.buildPartA();
		builder.buildPartB();
		builder.buildPartC();
		return builder.getResult();
	}
}