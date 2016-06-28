/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 28, 2016 1:28:45 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch8;

/**
 * ClassName    : E14 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 28, 2016 1:28:45 PM <br>
 * 
 * @author mayan
 * @version 
 */
public class E14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RoundGlyph(5);
		new RectanglarGlyph(10, 20);
	}

}

class Glyph {
	void draw() {
		System.out.println("Glyph.draw()");
	}
	Glyph() {
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;
	RoundGlyph(int r) {
		radius = r;
		System.out.println("RoundGlyph.RoundGraph().radius = " + radius);
	}
	void draw() {
		System.out.println("RoundGlyph.draw().radius = " + radius);
	}
}

class RectanglarGlyph extends Glyph {
	private int length = 1;
	private int width = 2;
	RectanglarGlyph(int l, int w) {
		length = l;
		width = w;
		System.out.println("RectanglarGlyph.RectanglarGlyph() length=" + length + " width=" + width);
	}
	void draw() {
		System.out.println("RectanglarGlyph.draw() length=" + length + " widht=" + width);
	}
}