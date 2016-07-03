package com.furzoom.lab.ch10;

public class Sequence {
	private Object[] items;
	private int next = 0;
	public Sequence(int size) {
		items = new Object[size];
	}
	public void add(Object x) {
		if (next < items.length) {
			items[next++] = x;
		}
	}
	private class SequenceSelector implements Selector {
		private int i = 0;
		public boolean end() {
			return i == items.length;
		}
		public Object current() {
			return items[i];
		}
		public void next() {
			if (i < items.length) {
				i++;
			}
		}
		public Sequence getOuter() {
			return Sequence.this;
		}
	}
	public Selector selector() {
		return new SequenceSelector();
	}

	public Selector reverseSelector() {
		return new Selector() {
			private int i = items.length - 1;
			public boolean end() {
				return i == -1;
			}
			public void next() {
				if (i > -1) {
					i--;
				}
			}
			public Object current() {
				return items[i];
			}
		};
	}
	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for (int i = 0; i < 10; ++i) {
			sequence.add(Integer.toString(i));
		}
		Selector selector = sequence.selector();
		while (!selector.end()) {
			System.out.println(selector.current());
			selector.next();
		}
		
		selector = sequence.reverseSelector();
		while (!selector.end()) {
			System.out.println(selector.current());
			selector.next();
		}
	}

}

interface Selector {
	boolean end();
	Object current();
	void next();
}
