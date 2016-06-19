package com.furzoom.lab.ch5;

public class E18 {
	E18(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		E18[] obj = new E18[2];
		obj[0] = new E18("hello");
		obj[1] = new E18("furzoom");
	}
}
