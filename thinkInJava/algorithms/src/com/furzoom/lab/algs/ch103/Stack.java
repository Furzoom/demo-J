/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Sep 27, 2016 5:07:34 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * ClassName    : Stack <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Sep 27, 2016 5:07:34 PM <br>
 * 
 * @version 
 */
public class Stack<Item> implements Iterable<Item>
{
    private Node first;
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
    
    public void push(Item item)
    {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        n++;
    }
    
    public Item pop()
    {
        Item item = first.item;
        first = first.next;
        n--;
        return item;
    }
    
    public Item peek()
    {
        return first.item;
    }
    
    public static <T> Stack<T> copy(Stack<T> s)
    {
        Iterator<T> it = s.iterator();
        Stack<T> result = new Stack<T>();
        Stack<T> temp = new Stack<T>();
        while (it.hasNext()) {
            temp.push(it.next());
        }
        it = temp.iterator();
        while (it.hasNext()) {
            result.push(it.next());
        }
        return result;
    }
       
    @Override
    public Iterator<Item> iterator()
    {
        return new ReverseArrayIterator();
    }
    
    private class ReverseArrayIterator implements Iterator<Item>
    {
        private Node p = first;
        @Override
        public boolean hasNext()
        {
            return p != null;
        }

       @Override
        public Item next()
        {
           Item item = p.item;
           p = p.next;
           return item;
        }
    }

    public static void main(String[] args)
    {
        Stack<String> s;
        s = new Stack<String>();
        while (!StdIn.isEmpty())
        {
            String item = StdIn.readString();
            if (!item.equals("-"))
                s.push(item);
            else if (!s.isEmpty())
                StdOut.print(s.pop() + " ");
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }
}
