/*
 * Copyright (c) 2017. http://furzoom.com/ All rights reversed.
 */

package com.furzoom.lab.algs.ch103;

import java.util.Iterator;

/**
 * Description :
 * Author      : mn@furzoom.com
 * Date        : 2017-09-20
 */
public class E10333 {
    public static void main(String[] args) {
//        Deque<String> deque = new Deque<>();
        ResizingArrayDeque<String> deque = new ResizingArrayDeque<>();
        deque.pushLeft("c");
        deque.pushLeft("b");
        deque.pushRight("d");
        deque.pushRight("e");

        System.out.println("deque size: " + deque.size());
        for (String s : deque) {
            System.out.println(s);
        }

        System.out.println("Pop up from right: ");
        while (!deque.isEmpty()) {
            System.out.println(deque.popRight());
        }

        deque.pushLeft("c");
        deque.pushLeft("b");
        deque.pushRight("d");
        deque.pushRight("e");
        System.out.println("Pop up from left: ");
        while (!deque.isEmpty()) {
            System.out.println(deque.popLeft());
        }

    }
}
