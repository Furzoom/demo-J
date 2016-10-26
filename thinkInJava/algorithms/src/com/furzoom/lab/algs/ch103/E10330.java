/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 25, 2016 3:08:48 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

/**
 * ClassName    : E10330 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Oct 25, 2016 3:08:48 PM <br>
 * 
 * @version 
 */
public class E10330
{
    public static void main(String[] args)
    {
        LinkList<String> ll = new LinkList<String>();
        ll.append("a");
        ll.append("B");
        ll.append("c");
        ll.append("D");
        ll.append("e");
        
        ll.printList();
        ll.reverse();
        System.out.println("After reverse list:");
        ll.printList();
    }
}
    