package com.furzoom.lab;

import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Iterator;

public class Exam1002 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        List<String> list = new LinkedList<String>();
        set.add("A");
        set.add("a");
        set.add("c");
        set.add("C");
        set.add("a");
        list.add("A");
        list.add("a");
        list.add("c");
        list.add("C");
        list.add("a");

        Iterator<String> it = set.iterator();
        Iterator<String> iter = list.iterator();
        System.out.print("Set: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        System.out.print("List: ");
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();
    }
}
