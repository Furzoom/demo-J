/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Sep 29, 2016 9:34:14 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch103;

import java.util.Iterator;

/**
 * ClassName    : DoublingStackOfStrings <br>
 * Function     : TODO ADD FUNCTION. <br>
 * date         : Sep 29, 2016 9:34:14 AM <br>
 * 
 * @version 
 */
public class DoublingStackOfStrings<Item> implements Iterable<Item>
{
    @SuppressWarnings("unchecked")
    private Item[] a = (Item[]) new Object[1];
    private int n;
    
    public int size()
    {
        return n;
    }
    
    public boolean isEmpty()
    {
        return n == 0;
    }
    
    public void push(Item item)
    {
        if (n == a.length) resize(2 * n);
        a[n++] = item;
    }
    
    public Item pop()
    {
        Item item = a[--n];
        a[n] = null;
        if (n > 0 && n == a.length / 4) resize(n * 2);
        return item;
    }
    
    public int arraySize()
    {
        return a.length;
    }
    
    private void resize(int max)
    {
        @SuppressWarnings("unchecked")
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < n; i++)
            temp[i] = a[i];
        a = temp;
    }
    
    @Override
    public Iterator<Item> iterator()
    {
        return new ArrayIterator();
    }
    
    private class ArrayIterator implements Iterator<Item>
    {
        private int i = n - 1;
        @Override
        public boolean hasNext()
        {
            return i >= 0;
        }
        
        @Override
        public Item next()
        {
            return a[i--];
        }
        
    }
}
