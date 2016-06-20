package com.furzoom.lab.ch5;

public class E19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foo(new String[] {"hello", "furzoom", "!"});
		foo("hello", "furzoom", "again", "!");
	}
	public static void foo(String...args) {
		for (String s : args) {
			System.out.print(s);
		}
		System.out.println();
	}

}
