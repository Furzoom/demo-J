/** 
 * Description :  
 * Author      : mn@furzoom.com 
 * Date        : Oct 26, 2016 2:04:23 PM 
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved. 
 */  
package com.furzoom.lab.algs.ch103;  
  
import java.util.Iterator;  
  
/** 
 * ClassName    : E10332 <br> 
 * Function     : TODO ADD FUNCTION. <br> 
 * date         : Oct 26, 2016 2:04:23 PM <br> 
 *  
 * @version  
 */  
public class E10332  
{  
    public static void main(String[] args)  
    {  
        Steque<String> s = new Steque<String>();  
        s.enqueue("d");  
        s.enqueue("e");  
        s.enqueue("f");  
        s.push("c");  
        s.push("b");  
        s.push("a");  
        System.out.println("Steque is:");  
        Iterator<String> it = s.iterator();  
        while (it.hasNext())  
        {  
            System.out.println(it.next());  
        }  
          
        System.out.println("pop up:");  
        while (!s.isEmpty())  
        {  
            System.out.println(s.pop());  
        }  
    }  
}  