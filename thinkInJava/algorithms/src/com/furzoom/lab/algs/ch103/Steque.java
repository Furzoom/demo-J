/** 
 * Description :  
 * Author      : mn@furzoom.com 
 * Date        : Oct 26, 2016 1:47:35 PM 
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved. 
 */  
/** 
 * ----------------------------------------------------- 
 * public class Steque<Item> implements Iterable<Item> 
 * ----------------------------------------------------- 
 *    boolean isEmpty()                 
 *       void push(Item e)             添加一个元素到头部 
 *       Item pop()                    从头部删除一个元素 
 *       void enqueue(Item e)          添加一个元素到尾部 
 * ----------------------------------------------------- 
 */  
package com.furzoom.lab.algs.ch103;  
  
import java.util.Iterator;  
  
/** 
 * ClassName    : Steque <br> 
 * Function     : TODO ADD FUNCTION. <br> 
 * date         : Oct 26, 2016 1:47:35 PM <br> 
 *  
 * @version  
 */  
public class Steque<Item> implements Iterable<Item>  
{  
    private Node first;  
    private Node last;  
      
    private class Node  
    {  
        public Item item;  
        public Node next;  
    }  
      
    public boolean isEmpty()  
    {  
        return first == null;  
    }  
      
    public void enqueue(Item e)  
    {  
        Node node = new Node();  
        node.item = e;  
        node.next = null;  
        if (isEmpty())  
        {  
            first = node;  
            last = node;  
        }  
        else  
        {  
            last.next = node;  
            last = node;  
        }  
    }  
      
    public void push(Item e)  
    {  
        Node node = new Node();  
        node.item = e;  
        if (isEmpty())  
        {  
            first = node;  
            last = node;  
            node.next = null;  
        }  
        else  
        {  
            node.next = first;  
            first = node;  
        }  
    }  
      
    public Item pop()  
    {  
        if (isEmpty())  
        {  
            return null;  
        }  
        else  
        {  
            Item e = first.item;  
            first = first.next;  
            return e;  
        }  
    }  
      
    @Override  
    public Iterator<Item> iterator()  
    {  
        return new Iter();  
    }  
      
    private class Iter implements Iterator<Item>  
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
            Item e = current.item;  
            current = current.next;  
            return e;  
        }  
    }  
}  

