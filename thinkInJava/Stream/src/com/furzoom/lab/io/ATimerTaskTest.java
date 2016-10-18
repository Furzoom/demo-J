/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 18, 2016 4:22:52 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.io;

import java.util.Timer;

/**
 * ClassName    : ATimerTaskTest <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Oct 18, 2016 4:22:52 PM <br>
 * 
 * @version 
 */
public class ATimerTaskTest
{
    public static void main(String[] args)
    {
        Timer timer = new Timer();
        timer.schedule(new ATimerTask(), 1000, 2000);
    }
}
