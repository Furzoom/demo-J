package com.furzoom.lab.ch8;

public class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Triangle.draw()");
	}
	@Override
	public void erase() {
		System.out.println("Trianble.erase()");
	}
}