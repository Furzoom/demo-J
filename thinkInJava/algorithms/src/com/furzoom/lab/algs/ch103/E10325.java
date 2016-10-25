/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 25, 2016 10:07:50 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

/**
 * ClassName    : E10325 <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Oct 25, 2016 10:07:50 AM <br>
 * 
 * @version 
 */
public class E10325
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
        
        Node<String> node = null;
        Node<String> pos = null;
        ll.insertAfter(pos, node);
        System.out.println("insertAfter(null, null) : ");
        ll.printList();
        
        pos = ll.search("e");
        ll.insertAfter(pos, node);
        System.out.println("insertAfter(\"e\", null): ");
        ll.printList();
        
        node = new Node<String>();
        node.item = "F";
        ll.insertAfter(pos, node);
        System.out.println("insertAfter(\"e\", \"F\"): ");
        ll.printList();
        
        pos = ll.search("c");
        node = new Node<String>();
        node.item = "X";
        ll.insertAfter(pos, node);
        System.out.println("insertAfter(\"c\", \"X\"): ");
        ll.printList();
        
    }
}
