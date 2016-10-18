/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Sep 28, 2016 10:21:54 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdIn;

/**
 * ClassName    : Queue <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Sep 28, 2016 10:21:54 AM <br>
 * 
 * @version 
 */
public class Queue<Item> implements Iterable<Item>
{
    private Node first;
    private Node last;
    private int n;
    
    private class Node
    {
        Item item;
        Node next;
    }
    
    public boolean isEmpty()
    {
        return first == null;
    }
    
    public int size()
    {
        return n;
    }
    
    public void enqueue(Item item)
    {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty())
        {
            first = last;
        }
        else 
        {
            oldlast.next = last;
        }
        n++;
    }
    
    public Item dequeue()
    {
        Item item = first.item;
        first = first.next;
        if (isEmpty())
        {
            last = null;
        }
        n--;
        return item;
    }
    
    @Override
    public Iterator<Item> iterator()
    {
        return new QueueIterator();
    }
    
    private class QueueIterator implements Iterator<Item>
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
        Queue<String> q = new Queue<String>();
        while (!StdIn.isEmpty())
        {
            String item = StdIn.readString();
            if (!item.equals("-"))
            {
                q.enqueue(item);
            }
            else if (!q.isEmpty())
            {
                System.out.print(q.dequeue() + " ");
            }
        }
        System.out.println("(" + q.size() + " left on queue)");
    }

}
