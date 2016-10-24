/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 24, 2016 4:30:32 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

import java.util.Iterator;

/**
 * ClassName    : LinkList <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Oct 24, 2016 4:30:32 PM <br>
 * 
 * @version 
 */
public class LinkList<Item> implements Iterable<Item>
{
    private Node first;
    
    private class Node
    {
        Item item;
        Node next;
    }
    
    public void append(Item item)
    {
        Node node = new Node();
        node.item = item;
        node.next = null;
        
        if (first == null) 
        {
            first = node;
            return;
        }
        
        Node current = first;
        while (current.next != null)
        {
            current = current.next;
        }
        current.next = node;

    }
    
    public void deleteLastNode()
    {
        Node current = first;
        if (current == null) return;
        
        Node next = current.next;
        if (next == null) 
        {
            first = null;
        }
        
        while (next.next != null)
        {
            current = next;
            next = next.next;
        }
        current.next = null;
    }
    
    public void delete(int k)
    {
        // deal with k <= 0, list is empty
        if (k <= 0 || first == null) return;
        // deal with first node
        if (k == 1) 
        {
            first = first.next;
            return;
        }
        
        // make current equals k-1 node
        k--;
        Node current = first;
        while (current != null && --k != 0)
        {
            current = current.next;
        }
        // list length less than k
        if (k != 0 || current == null || current.next == null)
        {
            return;
        }
        else
        {
            current.next = current.next.next;
        }
    }
    
    @Override
    public Iterator<Item> iterator()
    {
        return new It();
    }
    
    private class It implements Iterator<Item>
    {
        Node node = first;
        @Override
        public boolean hasNext()
        {
            return node != null;
        }

        /* (non-Javadoc)
         * @see java.util.Iterator#next()
         */
        @Override
        public Item next()
        {
            Item item = node.item;
            node = node.next;
            return item;
        }
    }
    
    public static void printList(LinkList<?> ll)
    {
        Iterator<?> it = ll.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    
    public static void main(String[] args)
    {
        LinkList<String> ll = new LinkList<String>();
        ll.append("a");
        ll.append("B");
        ll.append("c");
        ll.append("D");
        ll.append("e");
        
        printList(ll);

        System.out.println("delete last node");
        ll.deleteLastNode();
        printList(ll);
       
        System.out.println("delete node at 0");
        ll.delete(0);
        printList(ll);
        
        System.out.println("delete node at 5");
        ll.delete(5);
        printList(ll);
        
        System.out.println("delete node at 4");
        ll.delete(4);
        printList(ll);
        
        System.out.println("delete node at 1");
        ll.delete(1);
        printList(ll);
    }
}
