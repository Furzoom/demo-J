/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 20, 2016 3:15:52 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

import java.util.Iterator;

/**
 * ClassName    : ResizingArrayQueueOfStrings <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Oct 20, 2016 3:15:52 PM <br>
 * 
 * @version 
 */
public class ResizingArrayQueueOfStrings<Item> implements Iterable<Item>
{
    private int first;
    private int last;
    private Item[] queue;
    
    @SuppressWarnings("unchecked")
    public ResizingArrayQueueOfStrings()
    {
        first = 0;
        last = 0;
        queue = (Item[])new Object[1];
    }
    
    public boolean isEmpty()
    {
        return first == last;
    }
    
    public int size()
    {
        return last - first;
    }
    
    public void enqueue(Item s)
    {
        if (last == queue.length) {
            resize(2 * size());
        }
        queue[last++] = s;
    }
    
    public Item dequeue()
    {
        if (size() < queue.length / 4) {
            resize(2 * size());
        }
        return queue[first++];
            
    }
    
    private void resize(int n)
    {
        @SuppressWarnings("unchecked")
        Item[] tmp = (Item[])new Object[n];
        int j = 0;
        for (int i = first; i < last; i++) {
            tmp[j++] = queue[i];
        }
        queue = tmp;
        last = last - first;
        first = 0;
    }
     
    @Override
    public Iterator<Item> iterator()
    {
        return new ArrayIterator();
    }
    
    private class ArrayIterator implements Iterator<Item>
    {
        private int i = first;
        
        @Override
        public boolean hasNext()
        {
            return i < last;
        }
        
        @Override
        public Item next()
        {
            Item s = queue[i];
            i++;
            return s;
        }
    }   
    
    public static void main(String[] args) {
        ResizingArrayQueueOfStrings<String> queue = new ResizingArrayQueueOfStrings<String>();
        queue.enqueue("a");
        System.out.println("size(): " + queue.size() + " | count: " + queue.queue.length);
        queue.enqueue("b");
        System.out.println("size(): " + queue.size() + " | count: " + queue.queue.length);
        queue.enqueue("c");
        System.out.println("size(): " + queue.size() + " | count: " + queue.queue.length);
        queue.enqueue("d");
        System.out.println("size(): " + queue.size() + " | count: " + queue.queue.length);
        queue.enqueue("e");
        System.out.println("size(): " + queue.size() + " | count: " + queue.queue.length);
        queue.enqueue("f");
        System.out.println("size(): " + queue.size() + " | count: " + queue.queue.length);
        queue.enqueue("g");
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue() + " | size(): " + queue.size() + " | count: " + queue.queue.length);
        }
    }

}
