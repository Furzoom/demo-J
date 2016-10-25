/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 24, 2016 4:30:01 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

/**
 * ClassName    : E10320 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Oct 24, 2016 4:30:01 PM <br>
 * 
 * @version 
 */
public class E10320
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
        System.out.println("delete node at 0");
        ll.delete(0);
        ll.printList();
        
        System.out.println("delete node at 5");
        ll.delete(5);
        ll.printList();
        
        System.out.println("delete node at 4");
        ll.delete(4);
        ll.printList();
        
        System.out.println("delete node at 1");
        ll.delete(1);
        ll.printList();
    }
}
