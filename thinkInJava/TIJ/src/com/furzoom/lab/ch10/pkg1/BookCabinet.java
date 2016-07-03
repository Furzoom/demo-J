package com.furzoom.lab.ch10.pkg1;

import com.furzoom.lab.ch10.pkg.*;

public class BookCabinet {
	protected class MyBook implements Book {
		public MyBook() {
		}

		public void read() {
			System.out.println("MyBook.read()");
		}
	}
}
