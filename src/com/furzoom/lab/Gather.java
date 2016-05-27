package com.furzoom.lab;

import java.util.List;
import java.util.ArrayList;

public class Gather {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        int i = (int)(Math.random() * (list.size() - 1));
        System.out.println("Random element: " + list.get(i));
        list.remove(2);
        System.out.println("Remove element at 2:");
        for (int j = 0; j < list.size(); ++j) {
            System.out.print(list.get(i) + " ");
        }
    }
}
