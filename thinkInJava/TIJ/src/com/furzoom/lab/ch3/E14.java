/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : May 31, 2016 9:39:37 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.ch3;

/**
 * ClassName    : E14 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * Reason       : TODO ADD REASON. <br>
 * date         : May 31, 2016 9:39:37 AM <br>
 * 
 * @author mayan
 * @version 
 */
public class E14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		relationalTest("aaa", "aaa");
		String s1 = "zxc";
		String s2 = "zxc";
		relationalTest(s1, s1);
		relationalTest(s1, s2);
		String s3 = new String("zxc");
		relationalTest(s1, s3);
	}
	
	public static void relationalTest(String s1, String s2) {
		//System.out.println(s1 + " > " + s2 + " : " +  (s1 > s2));
		//System.out.println(s1 + " < " + s2 + " : " +  (s1 < s2));
		//System.out.println(s1 + " >= " + s2 + " : " +  (s1 >= s2));
		//System.out.println(s1 + " <= " + s2 + " : " +  (s1 <= s2));
		System.out.println(s1 + " == " + s2 + " : " +  (s1 == s2));
		System.out.println(s1 + " != " + s2 + " : " +  (s1 != s2));
		System.out.println(s1 + ".equals(" + s2 + ") : " + s1.equals(s2));
		System.out.println();
	}

}
