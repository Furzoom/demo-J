/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 25, 2016 11:39:46 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

import java.util.Iterator;

/**
 * ClassName    : CircleQueue <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Oct 25, 2016 11:39:46 AM <br>
 * 
 * @version 
 */
public class CircleQueue<Item> implements Iterable<Item>
{
    private Node last;
    
    private class Node
    {
        public Item item;
        public Node next;
    }
    
    public CircleQueue()
    {
        last = null;
    }
    
    public boolean isEmpty()
    {
        return last == null;
    }
    
    public Item dequeue()
    {
        if (isEmpty())
            return null;
        
        Item item = last.next.item;
        if (last.next == last)
        {
            last = null;
        }
        else
        {
            last.next = last.next.next;
        }
        return item;
    }
    
    public void enqueue(Item item)
    {
        Node node = new Node();
        node.item = item;
        if (last == null)
        {
            last = node;
            node.next = node;
        }
        else {
            node.next = last.next;
            last.next = node;
            last = node;
        }
    }
    
    @Override
    public Iterator<Item> iterator()
    {
        return new Iter();
    }
    
    private class Iter implements Iterator<Item>
    {
        private Node first;
        private boolean one;
        
        public Iter()
        {
            if (last == null)
            {
                first = null;
            }
            else 
            {
                first = last.next;
                one = (last == last.next);
            }
        }
        @Override
        public boolean hasNext()
        {
            // if
            if (last == last.next)
            {
                if (one)
                {
                    one = false;
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return first != null;
            }
        }
        @Override
        public Item next()
        {
            Item item;
            if (last == last.next)
            {
                first = null;
                item = last.item;
            }
            else
            {
                item = first.item;
                first = first.next;
                if (first == last.next)
                {
                    first = null;
                }
            }
            return item;
        }
    }
}
