/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 18, 2016 2:32:25 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */

package com.furzoom.lab.io;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * ClassName : AnnotationIntro <br>
 * Function : TODO ADD FUNCTION. <br>
 * date : Oct 18, 2016 2:32:25 PM <br>
 * 
 * @version
 */
public class AnnotationIntro {
	public static void main(String[] args) throws Exception {
		Method[] methods = Class.forName("com.furzoom.lab.io.AnnotationTest")
				.getDeclaredMethods();
		Annotation[] annotations;
		for (Method method : methods) {
			annotations = method.getAnnotations();
			for (Annotation annotation : annotations) {
				System.out.println(method.getName() + " : "
						+ annotation.annotationType().getName());
			}
		}
	}
}
