package com.furzoom.lab.ch10;

public class E02 {
	private String value = "default";
	public String toString() {
		return value;
	}
	E02(int i) {
		value = Integer.toString(i);
	}
	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for (int i = 0; i < 10; ++i) {
			sequence.add(new E02(2*i));
		}
		Selector selector = sequence.selector();
		while (!selector.end()) {
			System.out.println(selector.current());
			selector.next();
		}
	}

}
