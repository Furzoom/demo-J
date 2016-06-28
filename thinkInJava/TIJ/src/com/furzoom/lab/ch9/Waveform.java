/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 28, 2016 4:28:38 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch9;

/**
 * ClassName    : Waveform <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 28, 2016 4:28:38 PM <br>
 * 
 * @author furzoom
 * @version 
 */
public class Waveform {
	private static long counter;
	private final long id = counter++;
	public String toString() {
		return "Waveform " + id;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Filter {
	public String name() {
		return getClass().getSimpleName();
	}
	public Waveform process(Waveform input) {
		return input;
	}
}

class LowPass extends Filter {
	private double cutoff;
	public LowPass(double cutoff) {
		this.cutoff = cutoff;
	}
	public Waveform process(Waveform input) {
		return input;
	}
}

class HighPass extends Filter {
	private double cutoff;
	public HighPass(double cutoff) {
		this.cutoff = cutoff;
	}
	public Waveform process(Waveform input) {
		return input;
	}
}

class BandPass extends Filter {
	private double cutoff;
	private double highCutoff;
	public BandPass(double cutoff, double highCutoff) {
		this.cutoff = cutoff;
		this.highCutoff = highCutoff;
	}
	public Waveform process(Waveform input) {
		return input;
	}
}