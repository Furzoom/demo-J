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
    private Node<Item> first;
    
    public void append(Item item)
    {
        Node<Item> node = new Node<Item>();
        node.item = item;
        node.next = null;
        
        if (first == null) 
        {
            first = node;
            return;
        }
        
        Node<Item> current = first;
        while (current.next != null)
        {
            current = current.next;
        }
        current.next = node;

    }
    
    public void deleteLastNode()
    {
        Node<Item> current = first;
        if (current == null) return;
        
        Node<Item> next = current.next;
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
        Node<Item> current = first;
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
    
    
    public void removeAfter(Node<Item> node)
    {
        if (node == null || node.next == null)
            return;
        Node<Item> current = node.next;
        Node<Item> next = current.next;
        node.next = null;
        while (current.next != null)
        {
            current = null;
            current = next;
            next = next.next;
        }
    }
    
    public Node<Item> search(Item item)
    {
        Node<Item> current = first;
        while (current != null)
        {
            if (item.equals(current.item))
            {
                return current;
            }
            current = current.next;
        }
        return null;
    }
    
    public void insertAfter(Node<Item> pos, Node<Item> node)
    {
        if (node == null || pos == node) 
            return;
        node.next = pos.next;
        pos.next = node;
    }
    
    public void remove(Item item)
    {
        while (first != null && item.equals(first.item))
        {
            first = first.next;
        }
        
        Node<Item> current = first;
        Node<Item> node;
        while (current != null && current.next != null)
        {
            node = current.next;
            if (item.equals(node.item))
            {
                current.next = node.next;
            }
            else
            {
                current = node;
            }
        }
    }
    
    public int max()
    {
        return 0;
    }
    
    public Node<Item> reverse()
    {
        Node<Item> oldFirst = first;;
        first = null;
        while (oldFirst != null)
        {
            Node<Item> second = oldFirst.next;
            oldFirst.next = first;
            first = oldFirst;
            oldFirst = second;
        }
        return first;
    }
    
    @Override
    public Iterator<Item> iterator()
    {
        return new It();
    }
    
    private class It implements Iterator<Item>
    {
        Node<Item> node = first;
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
    
    public void printList()
    {
        Iterator<Item> it = iterator();
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
        
        ll.printList();

        System.out.println("delete last node");
        ll.deleteLastNode();
        ll.printList();
       
        System.out.println("delete node at 0");
        ll.delete(0);
        ll.printList();
        
        System.out.println("delete node at 5");
        ll.delete(5);
        ll.printList();
        
        System.out.println("delete node at 4");
        ll.delete(4);
        ll.printList();
        
        System.out.println("delete node at 1");
        ll.delete(1);
        ll.printList();
    }
}    

class Node<Item>
{
    Item item;
    Node<Item> next;
}
    
 
