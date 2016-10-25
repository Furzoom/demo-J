/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 24, 2016 6:06:52 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

/**
 * ClassName    : E10324 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Oct 24, 2016 6:06:52 PM <br>
 * 
 * @version 
 */
public class E10324
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
        
        Node<String> node = ll.search("f");
        ll.removeAfter(node);
        System.out.println("remove after \"f\": ");
        ll.printList();
        
        node = ll.search("e");
        ll.removeAfter(node);
        System.out.println("remove after \"e\": ");
        ll.printList();
        
        node = ll.search("D");
        ll.removeAfter(node);
        System.out.println("remove after \"D\": ");
        ll.printList();
        
        node = ll.search("a");
        ll.removeAfter(node);
        System.out.println("remove after \"a\": ");
        ll.printList();
    }
           
}
