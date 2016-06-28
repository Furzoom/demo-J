/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 27, 2016 4:05:46 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch8;

/**
 * ClassName    : Instrument <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 27, 2016 4:05:46 PM <br>
 * 
 * @author furzoom
 * @version 
 */
public class Instrument {
	void play(Note n) {
		System.out.println("Instrument.play() " + n);
	}
	public String toString() {
		return "Instrument";
	}
	void adjust() {
		System.out.println("Adjusting Instrument");
	}
}

class Wind extends Instrument {
	void play(Note n) {
		System.out.println("Wind.play() " + n);
	}
	public String toString() {
		return "Wind";
	}
	void adjust() {
		System.out.println("Adjusting Wind");
	}
}

class Percussion extends Instrument {
	void play(Note n) {
		System.out.println("Percussion.play() " + n);
	}
	public String toString() {
		return "Percussion";
	}
	void adjust() {
		System.out.println("Adjusting Percussion");
	}
}

class Stringed extends Instrument {
	void play(Note n) {
		System.out.println("Stringed.play() " + n);
	}
	public String toString() {
		return "Stringed";
	}
	void adjust() {
		System.out.println("Adjusting Stringed");
	}
}

class Midi extends Instrument {
	void play(Note n) {
		System.out.println("Midi.paly() " + n);
	}
	public String toString() {
		return "Midi";
	}
	public void adjust() {
		System.out.println("Adjusting Midi");
	}
}

class Brass extends Wind {
	void play(Note n) {
		System.out.println("Brass.play() " + n);
	}
	void adjust() {
		System.out.println("Adjusting Brass");
	}
}

class Woodwind extends Wind {
	void play(Note n) {
		System.out.println("Woodwind.play() " + n);
	}
	public String toString() {
		return "Woodwind";
	}
}
