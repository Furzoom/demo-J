/*
 * Copyright (c) 2017. http://furzoom.com/ All rights reversed.
 */

package com.furzoom.lab.algs.ch103;

/**
 * Description :
 * Author      : mn@furzoom.com
 * Date        : 2017-09-20
 */

import java.util.Iterator;

/**
 * -----------------------------------------------------
 * public class Deque<Item> implements Iterable<Item>
 * -----------------------------------------------------
 *              Deque()              创建空双向队列
 *      boolean isEmpty()            双向队列是否为空
 *          int size()               双向队列中元素的数量
 *         void pushLeft(Item item)  向左端添加一个新元素
 *         void pushRight(Item item) 向右端添加一个新元素
 *         Item popLeft()            从左端删除一个元素
 *         Item popRight()           从右端删除一个元素
 * -----------------------------------------------------
 */
public class Deque<Item> implements Iterable<Item> {
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    private class Node {
        public Item item;
        public Node prev;
        public Node next;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void pushLeft(Item item) {
        Node node = new Node();
        node.item = item;
        node.prev = null;
        if (isEmpty()) {
            head = tail = node;
            node.next = null;
        } else {
            head.prev = node;
            node.next = head;
            head = node;
        }
        size ++;
    }

    public void pushRight(Item item) {
        Node node = new Node();
        node.item = item;
        node.next = null;

        if (isEmpty()) {
            head = tail = node;
            node.prev = null;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size ++;
    }

    public Item popLeft() {
        if (isEmpty()) {
            return null;
        } else {
            Item e = head.item;
            if (size() == 1) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev.next = null;
                head.prev = null;
            }
            size --;
            return e;
        }
    }

    public Item popRight() {
        if (isEmpty()) {
            return null;
        } else {
            Item e = tail.item;
            if (size() == 1) {
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next.prev = null;
                tail.next = null;
            }
            size --;
            return e;
        }
    }

    @Override
    public Iterator<Item> iterator() {
        return new Iter();
    }

    private class Iter implements Iterator<Item> {
        private Node current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item e = current.item;
            current = current.next;
            return e;
        }
    }
}
