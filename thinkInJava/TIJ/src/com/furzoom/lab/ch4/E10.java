/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Jun 1, 2016 4:09:46 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch4;

/**
 * ClassName    : E10 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : Jun 1, 2016 4:09:46 PM <br>
 * 
 * @author mayan
 * @version 
 */
public class E10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1001; i < 10000; ++i) {
			if (is_vampire(i)) {
				System.out.println(i);
			}
		}
		
	}
	
	public static boolean is_vampire(int n) {
		if (n % 100 == 0) {
			return false;
		}
		int[] arr = new int[4];
		arr[0] = n / 1000;
		arr[1] = n % 1000 / 100;
		arr[2] = n % 100 / 10;
		arr[3] = n % 10;
		
		if (n == (arr[0]*10 + arr[1]) * (arr[2]*10 + arr[3])) {
			return true;
		} else if (n == (arr[0]*10 + arr[1]) * (arr[3]*10 + arr[2])) {
			return true;
		} else if (n == (arr[1]*10 + arr[0]) * (arr[2]*10 + arr[3])) {
			return true;
		} else if (n == (arr[1]*10 + arr[0]) * (arr[3]*10 + arr[2])) {
			return true;
		} else if (n == (arr[0]*10 + arr[2]) * (arr[1]*10 + arr[3])) {
			return true;
		} else if (n == (arr[0]*10 + arr[2]) * (arr[3]*10 + arr[1])) {
			return true;
		} else if (n == (arr[2]*10 + arr[0]) * (arr[1]*10 + arr[3])) {
			return true;
		} else if (n == (arr[2]*10 + arr[0]) * (arr[3]*10 + arr[1])) {
			return true;
		} else if (n == (arr[0]*10 + arr[3]) * (arr[1]*10 + arr[2])) {
			return true;
		} else if (n == (arr[0]*10 + arr[3]) * (arr[2]*10 + arr[1])) {
			return true;
		} else if (n == (arr[3]*10 + arr[0]) * (arr[1]*10 + arr[2])) {
			return true;
		} else if (n == (arr[3]*10 + arr[0]) * (arr[2]*10 + arr[1])) {
			return true;
		} else {
			return false;
		}
	}

}
