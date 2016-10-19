/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 18, 2016 1:52:54 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */

package com.furzoom.lab.io;

import java.lang.annotation.*;

/**
 * ClassName : NewAnnotation <br>
 * Function : TODO ADD FUNCTION. <br>
 * date : Oct 18, 2016 1:52:54 PM <br>
 * 
 * @version
 */
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.CONSTRUCTOR })
public @interface Greeting {
	public enum FontColor {
		RED, GREEN, BLUE
	};

	String name();

	String content();

	FontColor fontColor() default FontColor.BLUE;
}
