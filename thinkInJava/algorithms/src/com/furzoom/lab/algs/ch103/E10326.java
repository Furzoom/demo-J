/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 25, 2016 10:28:24 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

/**
 * ClassName    : E10326 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Oct 25, 2016 10:28:24 AM <br>
 * 
 * @version 
 */
public class E10326
{
    public static void main(String[] args)
    {
        LinkList<String> ll = new LinkList<String>();
        ll.append("a");
        ll.append("a");
        ll.append("a");
        
        ll.printList();
        
        ll.remove("b");
        System.out.println("After remove(\"b\"): ");
        ll.printList();
       
        ll.remove("a");
        System.out.println("After remove(\"a\"): ");
        ll.printList();
        
        ll.append("b");
        ll.append("b");
        ll.append("a");
        ll.append("a");
        ll.append("b");
        ll.append("b");
        ll.append("b");
        System.out.println("new list: ");
        ll.printList();
        
        ll.remove("b");
        System.out.println("After remove(\"b\"): ");
        ll.printList();
         
        ll.append("b");
        ll.append("b");
        ll.append("a");
        ll.append("a");
        ll.append("b");
        ll.append("b");
        ll.append("b");
        System.out.println("another new list: ");
        ll.printList();
        
        ll.remove("a");
        System.out.println("After remove(\"a\"): ");
        ll.printList();
        
        
    }
}
