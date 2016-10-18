/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 18, 2016 1:53:37 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.io;

/**
 * ClassName    : AnnotationTest <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Oct 18, 2016 1:53:37 PM <br>
 * 
 * @version 
 */
//@Greeting(name="AnnotationTest", content="test")
public class AnnotationTest
{
    @Greeting(name = "Just a test", content="Foo")
    public static void main(String[] args)
    {
    }

    @Greeting(name="Hello", content="world")
    public void sayHello()
    {
        
    }
}
