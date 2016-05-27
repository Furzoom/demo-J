package com.furzoom.lab;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class Exam1001 {
    public static void main(String[] args) {
        List list = new LinkedList();
        for (int i = 1; i <=100; ++i) {
            list.add(i);
        }
        list.remove(list.indexOf(10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
