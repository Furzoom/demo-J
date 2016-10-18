/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Sep 28, 2016 10:55:38 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

import java.util.Iterator;

/**
 * ClassName    : Bag <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Sep 28, 2016 10:55:38 AM <br>
 * 
 * @version 
 */
public class Bag<Item> implements Iterable<Item>
{
    private Node first;
    private class Node
    {
        Item item;
        Node next;
    }
    
    public void add(Item item)
    {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }
    
    @Override
    public Iterator<Item> iterator()
    {
        return new ListIterator();
    }
    
    private class ListIterator implements Iterator<Item>
    {
        private Node current = first;
        @Override
        public boolean hasNext()
        {
            return current != null;
        }
        
        @Override
        public Item next()
        {
            Item item = current.item;
            current = current.next;
            return item;
        }
        
    }

    public static void main(String[] args)
    {

    }
}
