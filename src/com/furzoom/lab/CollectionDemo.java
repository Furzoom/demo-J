package com.furzoom.lab;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class CollectionDemo {
    public static void main(String[] args) {
        String a = "A";
        String b = "B";
        String c = "C";
        String d = "D";
        String e = "E";
        String apple = "apple";
        List<String> list = new LinkedList<String>();
        list.add(a);
        list.add(e);
        list.add(d);
        Iterator<String> firstIterator = list.iterator();
        System.out.println("Before modify: ");
        while (firstIterator.hasNext()) {
            System.out.print(firstIterator.next() + " ");
        }
        System.out.println();

        list.set(1, b);
        list.add(2, c);
        firstIterator = list.iterator();
        System.out.println("After modify: ");
        while (firstIterator.hasNext()) {
            System.out.print(firstIterator.next() + " ");
        }
        System.out.println();

        list = new ArrayList<String>();
        list.add(a);
        list.add(apple);
        list.add(b);
        list.add(apple);
        list.add(c);
        list.add(apple);
        list.add(d);
        System.out.println(list);
        System.out.println("apple first index: " + list.indexOf(apple));
        System.out.println("apple last index: " + list.lastIndexOf(apple));
        System.out.println("b first index: " + list.indexOf(b));
        System.out.println("b last index: " + list.lastIndexOf(b));


        list = new ArrayList<String>();
        list.add("apple");
        list.add("pear");
        list.add("banana");
        list.add("apple");

        Set<String> set = new HashSet<String>();
        set.addAll(list);
        Iterator<String> it = set.iterator();
        System.out.println("Elements in set: ");
        while (it.hasNext()) {
            System.out.print("\t" + it.next());
        }
        System.out.println();
        
    }
}

