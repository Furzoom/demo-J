package com.furzoom.lab.ch10;

import com.furzoom.lab.ch10.pkg.Book;
import com.furzoom.lab.ch10.pkg1.BookCabinet;

public class E06 extends BookCabinet {
	public Book getBook() {
		return new MyBook();
	}
	public static void main(String[] args) {
		E06 e = new E06();
		e.getBook().read();;
	}

}
