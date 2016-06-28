/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 28, 2016 4:50:05 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch9;

/**
 * ClassName    : FilterProcessor <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 28, 2016 4:50:05 PM <br>
 * 
 * @author furzoom
 * @version 
 */
public class FilterProcessor {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Waveform w = new Waveform();
		Apply.process(new FilterAdapter(new LowPass(1.0)), w);
		Apply.process(new FilterAdapter(new HighPass(2.0)), w);
		Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);
		
	}

}

class FilterAdapter implements Processor {
	Filter filter;
	public FilterAdapter(Filter filter) {
		this.filter = filter;
	}
	public String name() {
		return filter.name();
	}
	public Waveform process(Object input) {
		return filter.process((Waveform)input);
	}
}