/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 28, 2016 4:20:57 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch9;

import java.util.Arrays;

/**
 * ClassName    : Apply <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 28, 2016 4:20:57 PM <br>
 * 
 * @author furzoom
 * @version 
 */
public class Apply {
	public static void process(Processor p, Object s) {
		System.out.println("Using Porcessor " + p.name());
		System.out.println(p.process(s));
	}
	public static String s = "Disagreement with beliefs is by definition incorrect";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process(new Upcase(), s);
		process(new Downcase(), s);
		process(new Splitter(), s);
	}

}

interface Processor {
	public String name(); 
	Object process(Object input); 
}

abstract class StringProcessor implements Processor {
	public String name() {
		return getClass().getSimpleName();
	}
	public abstract Object process(Object input);
}

class Upcase extends StringProcessor {
	public String process(Object input) {
		return ((String)input).toUpperCase();
	}
}

class Downcase extends StringProcessor {
	public String process(Object input) {
		return ((String)input).toLowerCase();
	}
}

class Splitter extends StringProcessor {
	public String process(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}
}