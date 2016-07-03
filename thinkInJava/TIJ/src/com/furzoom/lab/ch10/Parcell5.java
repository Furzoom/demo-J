package com.furzoom.lab.ch10;

public class Parcell5 {
	public Destination destination(String s) {
		class PDestination implements Destination {
			private String label;
			private PDestination(String s) {
				label = s;
			}
			public String readLabel() {
				return label;
			}
		}
		return new PDestination(s);
	}
	public static void main(String[] args) {
		Parcell5 p = new Parcell5();
		Destination d = p.destination("Furzoom");
		System.out.println(d.readLabel());
	}

}

interface Destination {
	String readLabel();
}