package com.furzoom.lab.ch5;

public class VarArgs {
	static void printArray(Object[] args) {
		for (Object obj : args) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
	
	static void printArray2(Object ... args) {
		for (Object obj : args) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArray(new Object[] {new Integer(1), new Float(1.2), new Double(12.34)});
		printArray(new Object[] {"one", "two", "three"});
		printArray(new Object[] {new A(), new A(), new A()});
		
		printArray2(1, 1.2F, 1.23);
		printArray2("hello", "furzoom", "!");
		printArray2(new A(), new A(), new A());
		printArray2((Object[])new Integer[]{1,2,3,4});
		printArray2();
		System.out.println(new int[1].getClass());
	}

}

class A {
	
}