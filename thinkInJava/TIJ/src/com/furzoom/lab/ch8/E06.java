/**
 * Description : E06, E07
 * Author      : mn@furzoom.com
 * Date        : Jun 27, 2016 5:44:04 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch8;

import java.util.Random;

/**
 * ClassName    : E06 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 27, 2016 5:44:04 PM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E06 {

	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	public static void tuneAll(Instrument[] e) {
		for (Instrument i : e) {
			tune(i);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument[] orchestra = {
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind(),
				new Midi(),
		};
		tuneAll(orchestra);
	}

}

class InstrumentGenerator {
	private Random rand = new Random();
	public Instrument next() {
		switch (rand.nextInt(6)) {
		case 0:
			return new Wind();
		case 1:
			return new Percussion();
		case 2:
			return new Stringed();
		case 3:
			return new Brass();
		case 4:
			return new Woodwind();
		case 5:
			return new Midi();
		default:
			return null;
		}
	}
}