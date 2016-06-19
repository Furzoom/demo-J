package com.furzoom.lab.ch5;

public class E14 {
	static String s1 = "directly initialize";
	static String s2;
	static {
		s2 = "in static block";
	}
	
	static void display() {
		System.out.println(s1);
		System.out.println(s2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E14.display();
	}

}
