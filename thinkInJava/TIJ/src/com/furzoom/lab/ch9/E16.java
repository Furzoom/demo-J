/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 29, 2016 1:22:03 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch9;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * ClassName    : E16 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 29, 2016 1:22:03 PM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(new RandomCharAdaptor(10));
		while (s.hasNext()) {
			System.out.println(s.next());
		}
	}

}

class RandomChar {
	private static Random rand = new Random(47);
	private static char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	public char next() {
		return letters[rand.nextInt(letters.length)];
	}
}

class RandomCharAdaptor implements Readable {
	private RandomChar rc = new RandomChar();
	private int count;
	public RandomCharAdaptor(int i) {
		this.count = i;
	}
	@Override
	public int read(CharBuffer cb) throws IOException {
		if (count-- == 0) {
			return -1;
		}
		cb.append(rc.next());
		return cb.length();
	}
}