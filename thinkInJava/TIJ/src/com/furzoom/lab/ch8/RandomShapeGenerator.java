package com.furzoom.lab.ch8;

import java.util.Random;

public class RandomShapeGenerator {
	private Random rand = new Random(4);
	public Shape next() {
		switch (rand.nextInt(4)) {
		case 0:
			return new Circle();
		case 1:
			return new Square();
		case 2:
			return new Triangle();
		case 3:
			return new Ring();
		default:
			System.out.println("Error");
			return null;
		}
	}
}