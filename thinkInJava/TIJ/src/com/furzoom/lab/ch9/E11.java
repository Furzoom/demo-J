/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 28, 2016 5:11:51 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch9;

import java.util.Arrays;

/**
 * ClassName    : E11 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 28, 2016 5:11:51 PM <br>
 * 
 * @author furzoom
 * @version 
 */
public class E11 {
	public static String s = "Disagreement with beliefs is by definition incorrect";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apply.process(new SwapStringFilter(new SwapString()), s);
	}

}

class SwapString {
	public String process(String s) {
		String[] arr = s.split(" ");
		String temp;
		for (int i = 1; i < arr.length; i += 2) {
			temp = arr[i];
			arr[i] = arr[i-1];
			arr[i-1] = temp;
		}
		return Arrays.toString(arr);
	}
}

class SwapStringFilter implements Processor {
	private SwapString ss;
	public SwapStringFilter(SwapString ss) {
		this.ss = ss;
	}
	@Override
	public String name() {
		return ss.getClass().getSimpleName();
	}

	public Object process(Object input) {
		return ss.process((String)input);
	}
	
}